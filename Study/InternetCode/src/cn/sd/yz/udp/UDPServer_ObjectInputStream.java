package cn.sd.yz.udp;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer_ObjectInputStream {
	public static void main(String[] args) throws Exception {
		System.out.println("----Server----\n准备建立连接");
//		1、使用DatagramSocket指定端口 创建接收端
		DatagramSocket server = new DatagramSocket(9999);
//		2、准备容器 封装成DatagramPacket包裹
		byte[] container = new byte[1024*60]; 
		DatagramPacket packet = new DatagramPacket(container, 0, container.length);
//		3、阻塞式接收包裹receive(DatagramPacket p)
		server.receive(packet);
//		4、分析数据
//		  byte[] getData()
//		         getLength()
		byte[] datas = packet.getData();
		ByteArrayInputStream bais = new ByteArrayInputStream(datas);
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(bais));
		char c = ois.readChar();
		int num = ois.readInt();
		boolean flag = ois.readBoolean();
		System.out.println(c);
		System.out.println(num);
		System.out.println(flag);
//		5、释放资源
		server.close();
	}
}
