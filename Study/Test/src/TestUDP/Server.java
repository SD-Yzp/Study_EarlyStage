package TestUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
	public static void main(String[] args) throws Exception {
		DatagramSocket server = new DatagramSocket(9999);
		byte[] container = new byte[1024*60];
		DatagramPacket packet = new DatagramPacket(container, 0, container.length);
		server.receive(packet);
		byte[] datas = packet.getData();
		int len = packet.getLength();
		String str = new String(datas,0,len);
		System.out.println(str);
	}
}
