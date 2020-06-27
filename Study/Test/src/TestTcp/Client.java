package TestTcp;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {
		//创建服务器
		ServerSocket serverSocket = new ServerSocket(9999);
		//阻塞式等待连接
		Socket client = serverSocket.accept();
		System.out.println("一个客户端连接");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		bw.write(str);
		bw.flush();
		bw.close();
		
	}
}
