package cn.sd.yz.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ��װ��Ӧ��Ϣ
 * 1�����ݿ��Զ�̬���
 * 2����ע״̬�룬ƴ�Ӻ���Ӧ��Э����Ϣ
 */

public class Server05 {
	ServerSocket serverSocket;
	
	public static void main(String[] args) {
		Server05 server = new Server05();
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
			Request2 request = new Request2(client);
			
			//����
			Response response = new Response(client);
			
			//��ע������
			response.print("<html>");
			response.print("<head>");
			response.print("<title>");
			response.print("响应");
			response.print("</title>");
			response.print("</head>");
			response.print("<body>");
			response.print("shsxt server终于回来了"+request.getParameterValue("uname"));
			response.print("</body>");
			response.print("</html>");
			//��ע��״̬��
			response.pushToBrowser(200);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("�ͻ��˴���");
		}
	}
	
	//ֹͣ����
	public void stop() {
	
	}
}
