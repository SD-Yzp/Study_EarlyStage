package cn.sd.yz.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 网络爬虫
 * @author Yin
 *
 */
public class WebSpiderTest {
	public static void main(String[] args) {
		String destStr = getURL("https://tieba.baidu.com/index.html?traceid=");
		
		String regexStr = "href=\"([\\w\\s./:]+?)\"";
		List<String> list = getMatcherSubStrs(destStr, regexStr);
		
		for (String temp : list) {
			System.out.println(temp);
		}
		
	
	}
	
	public static List<String> getMatcherSubStrs(String destStr,String regexStr){
		Pattern p = Pattern.compile(regexStr);
		Matcher m = p.matcher(destStr);
		List<String> list = new ArrayList<String>();
		while(m.find()) {
			list.add(m.group(1));
		}
		return list;
	}	
	public static String getURL(String webRUL) {
		StringBuilder sb = new StringBuilder();
		try {
			URL url = new URL(webRUL);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String str = "";
			while((str = br.readLine())!=null) {
				sb.append(str);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return sb.toString();
	}
}
