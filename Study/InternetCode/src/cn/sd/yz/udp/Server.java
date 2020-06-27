package cn.sd.yz.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * ·þÎñÆ÷¶Ë
 * @author Yin
 *
 */
public class Server {
	public static void main(String[] args) throws Exception {
		DatagramSocket server = new DatagramSocket(8888);
		String str = "test";
		byte[] datas = str.getBytes();
		DatagramPacket packet = new DatagramPacket(datas, 0, datas.length,
				new InetSocketAddress("localhost", 9999));
		server.send(packet);
		server.close();
	}
}
