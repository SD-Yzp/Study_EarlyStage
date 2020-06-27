package cn.sd.yz.server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Date;

public class Response {
	private BufferedWriter bw;
	//正文
	private StringBuilder content = new StringBuilder();;
	//协议头(状态行与请求头 回车)信息
	private StringBuilder headInfo = new StringBuilder();
	private int len = 0;
	private final String BLANK = " ";
	private final String CRLF = "\r\n";
	
	private Response() {
	}
	
	public Response(Socket client) {
		try {
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
		} catch (IOException e) {
			e.printStackTrace();
			headInfo = null;
		}
	}
	
	public Response(OutputStream os) {
		bw = new BufferedWriter(new OutputStreamWriter(os));
	}
	
	//动态添加内容
	public Response print(String info) {
		content.append(info);
		len += info.getBytes().length;
		return this;
	}
	
	public Response println(String info) {
		content.append(info).append(CRLF);
		len += (info+CRLF).getBytes().length;
		return this;
	}
	
	//推送响应信息
	public void pushToBrowser(int code) throws IOException {
		if(headInfo==null) {
			code = 505;
		}
		createHeadInfo(code);
		bw.append(headInfo);
		bw.append(content);
		bw.flush();
	}
	
	//构建头信息
	public void createHeadInfo(int code) {
		//1、响应行：HTTP/1.1 200 OK
		headInfo.append("HTTP/1.1").append(BLANK);
		headInfo.append(code).append(BLANK);
		switch(code) {
			case 200:
				headInfo.append("OK").append(CRLF);
				break;
			case 404:
				headInfo.append("NOT FOUND").append(CRLF);
				break;
			case 505:
				headInfo.append("SERVER ERROR").append(CRLF);
				break;
		}
		//2、响应头(最后一行存在空行)：
		/*
		 * Date:Mon,31Dec209904:25:57GMT
		 * Server:shsxt Server/0.01;charset=GBK
		 * Content-type:text/html
		 * Content-length:39725420
		 */
		headInfo.append("Data:").append(new Date()).append(CRLF);
		headInfo.append("Server:").append("shsxt Server/0.0.1;charset=UTF-8").append(CRLF);
		headInfo.append("Content-type:text/html").append(CRLF);
		headInfo.append("Content-length:").append(len).append(CRLF);
		headInfo.append(CRLF);
		
	}
}
