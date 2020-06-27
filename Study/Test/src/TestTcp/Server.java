package TestTcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		Socket server = new Socket(InetAddress.getLocalHost(),9999);
		BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
		String str = br.readLine();
		System.out.println(str);
		br.close();
		server.close();
	}
}
