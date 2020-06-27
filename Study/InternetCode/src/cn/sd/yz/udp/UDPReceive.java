package cn.sd.yz.udp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceive implements Runnable
{
//	1��ʹ��DatagramSocketָ���˿� �������ն�
	private DatagramSocket server;

	
	
	
	
	
	public UDPReceive(DatagramSocket server) {
		super();
		this.server = server;
	}






	@Override
	public void run() {
//		2��׼������ ��װ��DatagramPacket����
		byte[] container = new byte[1024*60]; 
		DatagramPacket packet = new DatagramPacket(container, 0, container.length);
//		3������ʽ���հ���receive(DatagramPacket p)
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = "";
		while(!str.equals("exit"))
		{
			try {
				server.receive(packet);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		4����������
//		  byte[] getData()
//		         getLength()
			byte[] datas = packet.getData();
			int len = packet.getLength();
			str = new String(datas, 0, len);
			try {
				bw.write(str);
				bw.newLine();
				bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
//		5���ͷ���Դ
		try {
			if(bw!=null)
			{
				bw.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		server.close();
		
	}
}
