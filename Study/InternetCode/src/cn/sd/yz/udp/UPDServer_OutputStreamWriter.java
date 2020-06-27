package cn.sd.yz.udp;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 1、使用DatagramSocket指定端口 创建接收端
 * 2、准备容器 封装成DatagramPacket包裹
 * 3、阻塞式接收包裹receive(DatagramPacket p)
 * 4、分析数据
 *   byte[] getData()
 *          getLength()
 * 5、释放资源
 * @author Yin
 *
 */
public class UPDServer_OutputStreamWriter {
	public static void main(String[] args) throws Exception {
		System.out.println("----Server----");
//		1、使用DatagramSocket指定端口 创建接收端
		DatagramSocket server = new DatagramSocket(9999);
//		2、准备容器 封装成DatagramPacket包裹
		byte[] container = new byte[1024*60]; 
		DatagramPacket packet = new DatagramPacket(container, 0, container.length);
//		3、阻塞式接收包裹receive(DatagramPacket p)
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = "";
		while(!str.equals("exit"))
		{
			server.receive(packet);
//			4、分析数据
//			  byte[] getData()
//			         getLength()
			byte[] datas = packet.getData();
			int len = packet.getLength();
			str = new String(datas, 0, len);
			bw.write(str);
			bw.newLine();
			bw.flush();
		}
//		5、释放资源
		bw.close();
		server.close();
	}
}
