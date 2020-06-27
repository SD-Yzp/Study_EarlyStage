package TestUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Client {
	public static void main(String[] args) throws IOException {
		DatagramSocket client = new DatagramSocket(8888);
		String str = "ÄãËµÉ¶£¿";
		byte[] datas = str.getBytes();
		DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, 
				new InetSocketAddress("localhost", 9999));
		client.send(packet);
		client.close();
	}
}
