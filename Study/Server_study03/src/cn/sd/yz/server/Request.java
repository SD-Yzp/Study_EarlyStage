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
 * 获取请求方法、请求url、请求参数
 * @author Yin
 *
 */
public class Request {
	private String requestInfo;
	//请求方法
	private String method;
	//请求url
	private String url;
	//请求参数
	private String queryStr;
	private final String CRLF = "\r\n";
	//存放参数
	private Map<String,List<String>> parameterMap;
	public Request(Socket client) throws IOException {
		this(client.getInputStream());
	}
	
	public Request(InputStream is) {
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
		
		//分割请求信息
		parseRequestInfo();
	}
	
	public void parseRequestInfo() {
//		System.out.println(requestInfo);
//		System.out.println("----1、请求方法，到第一个/----");
		method = requestInfo.substring(0, requestInfo.indexOf("/")).toLowerCase().trim();
//		System.out.println(method);
		
//		System.out.println("----2、请求url，第一个/和第一个HTTP/----");
//		System.out.println("---方法为post的话，?前为url----");
		String uri = requestInfo.substring(requestInfo.indexOf("/")+1, requestInfo.indexOf("HTTP/")).trim();
		int tag = uri.indexOf("?");
		if(tag != -1) {
			url = uri.substring(0, tag);
			queryStr = uri.substring(tag+1,uri.length());
		}else {
			url = uri;
			queryStr = "";
		}
//		System.out.println(url);
		
//		System.out.println("----3、请求参数，get方法和post方法不同----");
		if(method.equals("post")) {
			String qStr = requestInfo.substring(requestInfo.lastIndexOf(CRLF)).trim();
			if(queryStr.length()>0) {
				queryStr += "&"+qStr;
			}else {
				queryStr = qStr;
			}
		}
//		System.out.println(decode(queryStr,"utf-8"));
		//存放到Map fav=1&fav=2&uname=shsxt&age=18&others=
		convertMap();
	}
	
	private void convertMap() {
		//分割请求参数
		String[] qStrs = queryStr.split("&");
		for(String qStr:qStrs) {
			//分割键值对
			String[] kv = qStr.split("=");
			kv = Arrays.copyOf(kv, 2); //将kv补充为2个参数的字符串数组
			//给键值对赋值
			String key = kv[0];
			String value = kv[1]==null?null:decode(kv[1],"utf-8");
			//存放到map中
			if(!parameterMap.containsKey(key)) {
				parameterMap.put(key, new ArrayList());
			}
			parameterMap.get(key).add(value);
		}
	}
	
	/**
	 * 解决中文
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
	 *由name获取values
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
	 *由name获取value
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
