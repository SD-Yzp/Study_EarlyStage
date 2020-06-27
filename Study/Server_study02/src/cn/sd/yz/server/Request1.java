package cn.sd.yz.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * 封装请求协议：获取method URI 以及请求参数
 * @author Yin
 *
 */
public class Request1 {
	private String requestInfo;
	//请求方式
	private String method;
	//请求url
	private String url;
	//请求参数
	private String queryStr;
	private final String CRLF = "\r\n";
	public Request1(Socket client) throws IOException {
		this(client.getInputStream());
	}
	
	public Request1(InputStream is) {
		byte[] datas = new byte[1024*1024];
		int len;
		try {
			len = is.read(datas);
			requestInfo = new String(datas, 0, len);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		//分解字符串
		parseRequestInfo();
	}
	
	public void parseRequestInfo() {
		System.out.println(requestInfo);
		System.out.println("----分解----");
		System.out.println("----1、获取请求方式：开头到第一个/----");
		method = requestInfo.substring(0, requestInfo.indexOf("/")).toLowerCase().trim();
		System.out.println(method);
		
		System.out.println("----2、获取请求url：第一个/到HTTP/----");
		System.out.println("----可能包含请求参数? 前面的为url----");
		String uri = requestInfo.substring(requestInfo.indexOf("/")+1, requestInfo.indexOf("HTTP/")).trim();
		int tag = uri.indexOf("?");
		if(tag != -1) {
			url = uri.substring(0, tag);
			queryStr = uri.substring(tag+1,uri.length());
		}else {
			url = uri;
			queryStr = "";
		}
		System.out.println(url);
		
		System.out.println("----3、获取请求参数：如果方法是get，那么已经获取，如果是post可能在请求体中----");
		if(method.equals("post")) {
			String qStr = requestInfo.substring(requestInfo.lastIndexOf(CRLF)).trim();
			if(queryStr.length()>0) {
				queryStr += "&"+qStr;
			}else {
				queryStr = qStr;
			}
		}
		System.out.println(queryStr);
	}
}
