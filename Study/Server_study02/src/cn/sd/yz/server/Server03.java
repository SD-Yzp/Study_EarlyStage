package cn.sd.yz.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 封装响应信息
 * 1、内容可以动态添加
 * 2、关注状态码，拼接好响应的协议信息
 */

public class Server03 {
	ServerSocket serverSocket;
	
	public static void main(String[] args) {
		Server03 server = new Server03();
		server.start();
	}
	
	//启动服务器
	public void start() {
		try {
			serverSocket = new ServerSocket(8887);
			receive();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("服务器启动失败...");
		}
	}
	//接收连接处理
	public void receive() {
		try {
			Socket client = serverSocket.accept();
			System.out.println("一个服务器建立了连接");
			//获取请求协议
			InputStream is = client.getInputStream();
			byte[] datas = new byte[1024*1024];
			int len = is.read(datas);
			String requestInfo = new String(datas, 0, len);
			System.out.println(requestInfo);
			
			//正文
			Response response = new Response(client);
			
			//关注了内容
			response.print("<html>");
			response.print("<head>");
			response.print("<title>");
			response.print("响应");
			response.print("</title>");
			response.print("</head>");
			response.print("<body>");
			response.print("shsxt server回来了");
			response.print("</body>");
			response.print("</html>");
			//关注了状态码
			response.pushToBrowser(200);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("客户端错误");
		}
	}
	
	//停止服务
	public void stop() {
	
	}
}
