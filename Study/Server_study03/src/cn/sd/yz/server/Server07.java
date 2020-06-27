package cn.sd.yz.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 加入Servlet
 */

public class Server07 {
	ServerSocket serverSocket;
	
	public static void main(String[] args) {
		Server07 server = new Server07();
		server.start();
	}
	
	//建立服务器
	public void start() {
		try {
			serverSocket = new ServerSocket(8887);
			receive();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("服务器启动失败...");
		}
	}
	//接收信息
	public void receive() {
		try {
			Socket client = serverSocket.accept();
			System.out.println("一个客户端建立了连接");
			//获取请求协议
			Request request = new Request(client);
			
			//获取响应协议
			Response response = new Response(client);
			
			Servlet servlet = WebApp.getServletFromUrl(request.getUrl());
			if(servlet!=null) {				
				servlet.service(request, response);
				//关注了状态码
				response.pushToBrowser(200);
			}else {
				//错误
				response.pushToBrowser(404);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("连接失败");
		}
	}
	
	//
	public void stop() {
	
	}
}
