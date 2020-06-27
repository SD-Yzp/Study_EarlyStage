package cn.sd.yz.udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * 1��ʹ��DatagramSocketָ���˿ڣ��������Ͷ�
 * 2��׼�����ݣ�ת�����ֽ�����
 * 3����װ��DatagramPacket��������Ҫָ��Ŀ�ĵ�
 * 4�����Ͱ���send(DatagramPacket p)*
 * 5���ͷ���Դ
 * @author Yin
 *
 */
public class UPDClient_InputStreamReader {
	public static void main(String[] args) throws Exception {
		System.out.println("----Client----\n׼����������");
//		1��ʹ��DatagramSocketָ���˿ڣ��������Ͷ�
		DatagramSocket client = new DatagramSocket(7777);
//		2��׼�����ݣ�ת�����ֽ�����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		String str = "";
		while(!str.equals("exit"))
		{			
			str = br.readLine();
			byte[] datas = str.getBytes();
//	    	3����װ��DatagramPacket��������Ҫָ��Ŀ�ĵ�
			DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, 
					new InetSocketAddress("localhost", 9999));
//			4�����Ͱ���send(DatagramPacket p)*
			client.send(packet);
		}
//		5���ͷ���Դ
		br.close();
		client.close();
	}
}
