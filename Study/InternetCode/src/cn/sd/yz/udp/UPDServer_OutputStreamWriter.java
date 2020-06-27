package cn.sd.yz.udp;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 1��ʹ��DatagramSocketָ���˿� �������ն�
 * 2��׼������ ��װ��DatagramPacket����
 * 3������ʽ���հ���receive(DatagramPacket p)
 * 4����������
 *   byte[] getData()
 *          getLength()
 * 5���ͷ���Դ
 * @author Yin
 *
 */
public class UPDServer_OutputStreamWriter {
	public static void main(String[] args) throws Exception {
		System.out.println("----Server----");
//		1��ʹ��DatagramSocketָ���˿� �������ն�
		DatagramSocket server = new DatagramSocket(9999);
//		2��׼������ ��װ��DatagramPacket����
		byte[] container = new byte[1024*60]; 
		DatagramPacket packet = new DatagramPacket(container, 0, container.length);
//		3������ʽ���հ���receive(DatagramPacket p)
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = "";
		while(!str.equals("exit"))
		{
			server.receive(packet);
//			4����������
//			  byte[] getData()
//			         getLength()
			byte[] datas = packet.getData();
			int len = packet.getLength();
			str = new String(datas, 0, len);
			bw.write(str);
			bw.newLine();
			bw.flush();
		}
//		5���ͷ���Դ
		bw.close();
		server.close();
	}
}
