package cn.sd.yz.udp;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDPClient_ObjectOutputStream {
	public static void main(String[] args) throws Exception {
		System.out.println("----Client----\n准备建立连接");
//		1、使用DatagramSocket指定端口，创建发送端
		DatagramSocket client = new DatagramSocket(7777);
//		2、准备数据，转换成字节数组
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(
				new BufferedOutputStream(baos));
		oos.writeChar('a');
		oos.writeInt(10);
		oos.writeBoolean(false);
		oos.flush();
		byte[] datas = baos.toByteArray();
//		3、封装成DatagramPacket包裹，需要指定目的地
		DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, 
				new InetSocketAddress("localhost", 9999));
//		4、发送包裹send(DatagramPacket p)*
		client.send(packet);
//		5、释放资源
		client.close();
	}
}
