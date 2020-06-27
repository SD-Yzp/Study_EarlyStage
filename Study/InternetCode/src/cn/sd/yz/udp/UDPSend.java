package cn.sd.yz.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPSend implements Runnable
{
//	1、使用DatagramSocket指定端口，创建发送端
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
//		2、准备数据，转换成字节数组
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
			str = name + "说：" + str; 
			byte[] datas = str.getBytes();
//	    	3、封装成DatagramPacket包裹，需要指定目的地
			DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, address);
//			4、发送包裹send(DatagramPacket p)*
			try {
				client.send(packet);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		5、释放资源
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
