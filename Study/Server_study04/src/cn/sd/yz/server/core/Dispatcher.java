package cn.sd.yz.server.core;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * 处理 404 500 和首页
 * @author Yin
 *
 */
public class Dispatcher implements Runnable{
	private Socket client;
	private Request request;
	private Response response;
	
	public Dispatcher(Socket client) {
		this.client = client;
		try {
			//获取请求协议	
			//获取响应协议
			request = new Request(client);
			response = new Response(client);
		} catch (IOException e) {
			e.printStackTrace();
			this.release();
		}
	}
	
	@Override
	public void run() {	
		try {
			if(request.getUrl()==null||request.getUrl().equals("")) {
				InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("index.html");
				BufferedInputStream bis = new BufferedInputStream(is);
				byte[] datas = new byte[1024*1024];
				int len = -1;
				len = bis.read(datas);
				String s = new String(datas,0,len); 				
				response.print(s);
				response.pushToBrowser(200);
				is.close();
				return;
			}
			Servlet servlet = WebApp.getServletFromUrl(request.getUrl());
			if(servlet!=null) {				
				servlet.service(request, response);
				//关注了状态码
				response.pushToBrowser(200);
			}else {
				//错误
				InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("error.html");
				BufferedInputStream bis = new BufferedInputStream(is);
				byte[] datas = new byte[1024*1024];
				int len = -1;
				len = bis.read(datas);
				String s = new String(datas,0,len); 				
				response.print(s);
				response.pushToBrowser(404);
				is.close();
			}
		}catch(Exception e){
			try {
				response.print("你好我不好，我会马上好");
				response.pushToBrowser(500);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
		release();
	}
	
	public void release() {
		try {
			if(client!=null) {
				client.close();				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
