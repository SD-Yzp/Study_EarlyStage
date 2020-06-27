package cn.sd.yz.server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server02 {
	ServerSocket serverSocket;
	
	public static void main(String[] args) {
		Server02 server = new Server02();
		server.start();
	}
	
	//����������
	public void start() {
		try {
			serverSocket = new ServerSocket(8887);
			receive();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("����������ʧ��...");
		}
	}
	//�������Ӵ���
	public void receive() {
		try {
			Socket client = serverSocket.accept();
			System.out.println("һ������������������");
			//��ȡ����Э��
			InputStream is = client.getInputStream();
			byte[] datas = new byte[1024*1024];
			int len = is.read(datas);
			String requestInfo = new String(datas, 0, len);
			System.out.println(requestInfo);
			
			//����
			StringBuilder content = new StringBuilder();
			content.append("<html>");
			content.append("<head>");
			content.append("<title>");
			content.append("��Ӧ");
			content.append("</title>");
			content.append("</head>");
			content.append("<body>");
			content.append("shsxt server������");
			content.append("</body>");
			content.append("</html>");
			int size = content.toString().getBytes().length;
			StringBuilder responseInfo = new StringBuilder();
			String blank = " ";
			String CRLF = "\r\n";
			//����
			//1����Ӧ�У�HTTP/1.1 200 OK
			responseInfo.append("HTTP/1.1").append(blank);
			responseInfo.append(200).append(blank);
			responseInfo.append("OK").append(CRLF);
			//2����Ӧͷ(���һ�д��ڿ���)��
			/*
			 * Date:Mon,31Dec209904:25:57GMT
			 * Server:shsxt Server/0.01;charset=GBK
			 * Content-type:text/html
			 * Content-length:39725420
			 */
			responseInfo.append("Data:").append(new Date()).append(CRLF);
			responseInfo.append("Server:").append("shsxt Server/0.0.1;charset=UTF-8").append(CRLF);
			responseInfo.append("Content-type:text/html").append(CRLF);
			responseInfo.append("Content-length:").append(size).append(CRLF);
			responseInfo.append(CRLF);
			//3������
			responseInfo.append(content.toString());
			
			//д�����ͻ���
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			bw.write(responseInfo.toString());
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("�ͻ��˴���");
		}
	}
	//��ͣ������
	public void stop() {
	
	}
}
