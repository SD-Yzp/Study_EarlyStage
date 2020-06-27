package cn.sd.yz.server.basic.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XmlTest02 {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		//SAX����
		//1����ȡ��������
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//2���ӽ��������л�ȡ������
		SAXParser parser = factory.newSAXParser();
		//3����д������
		//4�������ĵ�Document ע�ᴦ����
		WebHandler handler = new WebHandler();
		//5������
		parser.parse(Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("web.xml")
				, handler);
		
		WebContext context = new WebContext(handler.getEntitys(),handler.getMappings());
		String className = context.getClz("/g");
		Class clz = Class.forName(className);
		Servlet servlet = (Servlet) clz.getConstructor().newInstance();
		servlet.service();
	}
}


