package cn.sd.yz.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * ��װ����Э�飺��ȡmethod URI �Լ��������
 * @author Yin
 *
 */
public class Request1 {
	private String requestInfo;
	//����ʽ
	private String method;
	//����url
	private String url;
	//�������
	private String queryStr;
	private final String CRLF = "\r\n";
	public Request1(Socket client) throws IOException {
		this(client.getInputStream());
	}
	
	public Request1(InputStream is) {
		byte[] datas = new byte[1024*1024];
		int len;
		try {
			len = is.read(datas);
			requestInfo = new String(datas, 0, len);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		//�ֽ��ַ���
		parseRequestInfo();
	}
	
	public void parseRequestInfo() {
		System.out.println(requestInfo);
		System.out.println("----�ֽ�----");
		System.out.println("----1����ȡ����ʽ����ͷ����һ��/----");
		method = requestInfo.substring(0, requestInfo.indexOf("/")).toLowerCase().trim();
		System.out.println(method);
		
		System.out.println("----2����ȡ����url����һ��/��HTTP/----");
		System.out.println("----���ܰ����������? ǰ���Ϊurl----");
		String uri = requestInfo.substring(requestInfo.indexOf("/")+1, requestInfo.indexOf("HTTP/")).trim();
		int tag = uri.indexOf("?");
		if(tag != -1) {
			url = uri.substring(0, tag);
			queryStr = uri.substring(tag+1,uri.length());
		}else {
			url = uri;
			queryStr = "";
		}
		System.out.println(url);
		
		System.out.println("----3����ȡ������������������get����ô�Ѿ���ȡ�������post��������������----");
		if(method.equals("post")) {
			String qStr = requestInfo.substring(requestInfo.lastIndexOf(CRLF)).trim();
			if(queryStr.length()>0) {
				queryStr += "&"+qStr;
			}else {
				queryStr = qStr;
			}
		}
		System.out.println(queryStr);
	}
}
