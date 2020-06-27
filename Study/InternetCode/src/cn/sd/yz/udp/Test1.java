package cn.sd.yz.udp;

import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Test1 {
	public static void main(String[] args) throws Exception {
		new Thread(new UDPSend(new DatagramSocket(9999),new InetSocketAddress("localhost",7777),"…Òœ…1")).start();
		new Thread(new UDPReceive(new DatagramSocket(7778))).start();
	}
}
