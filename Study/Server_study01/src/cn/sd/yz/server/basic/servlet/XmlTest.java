package cn.sd.yz.server.basic.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XmlTest {
	public static void main(String[] args) throws Exception {
		//SAX解析
		//1、获取解析工厂
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//2、从解析工厂中获取解析器
		SAXParser parser = factory.newSAXParser();
		//3、编写处理器
		//4、加载文档Document 注册处理器
		WebHandler handler = new WebHandler();
		//5、解析
		parser.parse(Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("cn/sd/yz/server/basic/servlet/web.xml")
				, handler);
		//获取数据
		WebContext context = new WebContext(handler.getEntitys(),handler.getMappings());
		//输入得到反馈
		String className = context.getClz("/reg");
		Class clz = Class.forName(className);
		Servlet servlet = (Servlet)clz.getConstructor().newInstance();
		servlet.service();
	}
}
