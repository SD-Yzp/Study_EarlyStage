package cn.sd.yz.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * ¿Í»§¶Ë
 * @author Yin
 *
 */
public class Client {
	public static void main(String[] args) throws IOException {
		DatagramSocket client = new DatagramSocket(9999);
		byte[] container = new byte[1024*60];
		DatagramPacket packet = new DatagramPacket(container, 0, container.length);
		client.receive(packet);
		byte[] datas = packet.getData();
		int len = packet.getLength();
		System.out.println(new String(datas,0,len));
	}
}	
