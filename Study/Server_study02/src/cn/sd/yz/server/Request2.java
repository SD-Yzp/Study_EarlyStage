package cn.sd.yz.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ��װ����Э�飺��ȡmethod URI �Լ��������
 * @author Yin
 *
 */
public class Request2 {
	private String requestInfo;
	//����ʽ
	private String method;
	//����url
	private String url;
	//�������
	private String queryStr;
	private final String CRLF = "\r\n";
	//�洢����
	private Map<String,List<String>> parameterMap;
	public Request2(Socket client) throws IOException {
		this(client.getInputStream());
	}
	
	public Request2(InputStream is) {
		parameterMap = new HashMap<String,List<String>>();
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
		System.out.println("----请求----");
		System.out.println("----1、请求头----");
		method = requestInfo.substring(0, requestInfo.indexOf("/")).toLowerCase().trim();
		System.out.println(method);
		
		System.out.println("----2、请求行----");
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
		//ת����Map fav=1&fav=2&uname=shsxt&age=18&others=
		convertMap();
	}
	
	private void convertMap() {
		//�ָ��ַ���
		String[] qStrs = queryStr.split("&");
		for(String qStr:qStrs) {
			//�ٴηָ�
			String[] kv = qStr.split("=");
			kv = Arrays.copyOf(kv, 2); //�����е�kv�������Ԫ�ص��ַ�������
			//��ȡ��ֵ��
			String key = kv[0];
			String value = kv[1]==null?null:decode(kv[1],"utf-8");
			//�洢��map��
			if(!parameterMap.containsKey(key)) {
				parameterMap.put(key, new ArrayList());
			}
			parameterMap.get(key).add(value);
		}
	}
	
	/**
	 * ��������
	 * @param value
	 * @param enc
	 * @return
	 */
	private String decode(String value,String enc) {
		try {
			return java.net.URLDecoder.decode(value, enc);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * ͨ��name��ȡ���ֵ
	 * @param key
	 * @return
	 */
	public String[] getParameterValues(String key) {
		List<String> values = parameterMap.get(key);
		if(values==null||values.size()<1) {
			return null;
		}
		return values.toArray(new String[0]);
	}
	
	/**
	 * ͨ��name��ȡһ��ֵ
	 * @param key
	 * @return
	 */
	public String getParameterValue(String key) {
		String[] values = getParameterValues(key);
		return values == null?null:values[0];
	}

	public String getMethod() {
		return method;
	}

	public String getUrl() {
		return url;
	}

	public String getQueryStr() {
		return queryStr;
	}
	
	
	
}
