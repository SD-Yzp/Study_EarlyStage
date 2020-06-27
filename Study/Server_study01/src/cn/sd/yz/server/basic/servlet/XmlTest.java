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
				.getResourceAsStream("cn/sd/yz/server/basic/servlet/web.xml")
				, handler);
		//��ȡ����
		WebContext context = new WebContext(handler.getEntitys(),handler.getMappings());
		//����õ�����
		String className = context.getClz("/reg");
		Class clz = Class.forName(className);
		Servlet servlet = (Servlet)clz.getConstructor().newInstance();
		servlet.service();
	}
}
