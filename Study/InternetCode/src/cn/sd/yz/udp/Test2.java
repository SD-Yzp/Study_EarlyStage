package cn.sd.yz.udp;

import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Test2 {
	public static void main(String[] args) throws Exception {
		new Thread(new UDPSend(new DatagramSocket(9998),new InetSocketAddress("localhost",7778),"…Òœ…2")).start();
		new Thread(new UDPReceive(new DatagramSocket(7777))).start();
	}
}
