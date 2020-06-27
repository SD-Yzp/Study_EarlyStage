package cn.sd.yz.server.core;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 加入Servlet
 */

public class Server {
	ServerSocket serverSocket;
	private boolean isRunning;
	
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
	
	//建立服务器
	public void start() {
		try {
			serverSocket = new ServerSocket(8887);
			isRunning = true;
			receive();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("服务器启动失败...");
		}
	}
	//接收信息
	public void receive() {		
		while(isRunning) {
			try {				
				Socket client = serverSocket.accept();
				System.out.println("一个客户端建立了连接");
				//多线程处理
				new Thread(new Dispatcher(client)).start();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("连接失败");
				stop();
			}
		}		
	}
	
	//停止服务
	public void stop() {
		isRunning = false;
		try {
			serverSocket.close();
			System.out.println("服务器关闭");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
