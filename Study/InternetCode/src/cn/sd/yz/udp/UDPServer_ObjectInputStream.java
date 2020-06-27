package cn.sd.yz.udp;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer_ObjectInputStream {
	public static void main(String[] args) throws Exception {
		System.out.println("----Server----\n׼����������");
//		1��ʹ��DatagramSocketָ���˿� �������ն�
		DatagramSocket server = new DatagramSocket(9999);
//		2��׼������ ��װ��DatagramPacket����
		byte[] container = new byte[1024*60]; 
		DatagramPacket packet = new DatagramPacket(container, 0, container.length);
//		3������ʽ���հ���receive(DatagramPacket p)
		server.receive(packet);
//		4����������
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
//		5���ͷ���Դ
		server.close();
	}
}
