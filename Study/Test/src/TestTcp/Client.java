package TestTcp;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {
		//����������
		ServerSocket serverSocket = new ServerSocket(9999);
		//����ʽ�ȴ�����
		Socket client = serverSocket.accept();
		System.out.println("һ���ͻ�������");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		bw.write(str);
		bw.flush();
		bw.close();
		
	}
}
