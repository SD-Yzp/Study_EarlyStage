package cn.sd.yz.server.core;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class WebApp {
	private static WebContext context;
	static {
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			
			SAXParser parser = factory.newSAXParser();
			
			WebHandler handler = new WebHandler();
			
			parser.parse(Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("web.xml")
					, handler);
			context = new WebContext(handler.getEntitys(),handler.getMappings());
		}catch(Exception e) {
			System.out.println("解析配置文件错误");
		}
	}
	
	/**
	 * 通过url获取配置文件对应的servlet
	 * @param url
	 * @return
	 */
	public static Servlet getServletFromUrl(String url) {
		String className = context.getClz("/"+url);
		//获取数据
		Class clz;
		try {
			clz = Class.forName(className);
			Servlet servlet = (Servlet) clz.getConstructor().newInstance();
			return servlet;
		} catch (Exception e) {
			System.out.println("不存在的方式");
		}
		return null;
	}
}

