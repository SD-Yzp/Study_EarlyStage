package cn.sd.yz.tcp;

import java.io.BufferedInputStream;
import java.net.InetAddress;
import java.net.Socket;


/**
 * TCPµÄ¿Í»§¶Ë
 * @author Yin
 *
 */
public class Client {
	public static void main(String[] args) throws Exception {
		Socket client = new Socket(InetAddress.getLocalHost(), 8888);
		BufferedInputStream bis = new BufferedInputStream(client.getInputStream());
		byte[] datas = new byte[1024*60];
		int len = -1;
		len = bis.read(datas);
		String str = new String(datas,0,len);
		System.out.println(str);
		bis.close();
		client.close();
	}
}
