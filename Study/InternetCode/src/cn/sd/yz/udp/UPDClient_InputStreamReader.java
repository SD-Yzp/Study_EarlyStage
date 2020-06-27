package cn.sd.yz.udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * 1、使用DatagramSocket指定端口，创建发送端
 * 2、准备数据，转换成字节数组
 * 3、封装成DatagramPacket包裹，需要指定目的地
 * 4、发送包裹send(DatagramPacket p)*
 * 5、释放资源
 * @author Yin
 *
 */
public class UPDClient_InputStreamReader {
	public static void main(String[] args) throws Exception {
		System.out.println("----Client----\n准备建立连接");
//		1、使用DatagramSocket指定端口，创建发送端
		DatagramSocket client = new DatagramSocket(7777);
//		2、准备数据，转换成字节数组
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		String str = "";
		while(!str.equals("exit"))
		{			
			str = br.readLine();
			byte[] datas = str.getBytes();
//	    	3、封装成DatagramPacket包裹，需要指定目的地
			DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, 
					new InetSocketAddress("localhost", 9999));
//			4、发送包裹send(DatagramPacket p)*
			client.send(packet);
		}
//		5、释放资源
		br.close();
		client.close();
	}
}
