package cn.sd.yz.server;

import java.io.IOException;
import java.net.Socket;

public class Dispatcher1 implements Runnable{
	private Socket client;
	private Request request;
	private Response response;
	
	public Dispatcher1(Socket client) {
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
			Servlet servlet = WebApp.getServletFromUrl(request.getUrl());
			if(servlet!=null) {				
				servlet.service(request, response);
				//关注了状态码
				response.pushToBrowser(200);
			}else {
				//错误
				response.pushToBrowser(404);
			}
		}catch(Exception e){
			try {
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
