package cn.sd.yz.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPSend implements Runnable
{
//	1��ʹ��DatagramSocketָ���˿ڣ��������Ͷ�
	DatagramSocket client;
	InetSocketAddress address;
	String name;
	
	
	public UDPSend(DatagramSocket client, InetSocketAddress address, String name) {
		super();
		this.client = client;
		this.address = address;
		this.name = name;
	}



	@Override
	public void run() {
//		2��׼�����ݣ�ת�����ֽ�����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		String str = "";
		while(!str.equals("exit"))
		{			
			try {
				str = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			str = name + "˵��" + str; 
			byte[] datas = str.getBytes();
//	    	3����װ��DatagramPacket��������Ҫָ��Ŀ�ĵ�
			DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, address);
//			4�����Ͱ���send(DatagramPacket p)*
			try {
				client.send(packet);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		5���ͷ���Դ
		try {
			if(br!=null)
			{				
				br.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		client.close();
	}
	
	
	

}
