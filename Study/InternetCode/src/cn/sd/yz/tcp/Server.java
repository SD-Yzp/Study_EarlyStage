package cn.sd.yz.tcp;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP�ķ����
 * @author Yin
 *
 */
public class Server {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(8888);
		Socket server = serverSocket.accept();
		System.out.println("������һ������");
		BufferedOutputStream bos = new BufferedOutputStream(server.getOutputStream());
		String str = "test";
		byte[] datas = str.getBytes();
		bos.write(datas);
		bos.flush();
		bos.close();
	}
}
