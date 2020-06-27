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
		System.out.println("----Client----\n׼����������");
//		1��ʹ��DatagramSocketָ���˿ڣ��������Ͷ�
		DatagramSocket client = new DatagramSocket(7777);
//		2��׼�����ݣ�ת�����ֽ�����
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(
				new BufferedOutputStream(baos));
		oos.writeChar('a');
		oos.writeInt(10);
		oos.writeBoolean(false);
		oos.flush();
		byte[] datas = baos.toByteArray();
//		3����װ��DatagramPacket��������Ҫָ��Ŀ�ĵ�
		DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, 
				new InetSocketAddress("localhost", 9999));
//		4�����Ͱ���send(DatagramPacket p)*
		client.send(packet);
//		5���ͷ���Դ
		client.close();
	}
}
