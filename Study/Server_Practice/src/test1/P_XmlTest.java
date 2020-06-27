package test1;


import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class P_XmlTest {
	public static void main(String[] args) throws Exception {
		//SAX解析
		//1、获取解析工厂
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//2、从解析工厂中获取解析器
		SAXParser parser = factory.newSAXParser();
		//3、加载文档 Document 注册处理器
		//4、编写处理器
		PersonHandler handler = new PersonHandler();
		//5、解析
		parser.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("test1/p.xml")
				, handler);
		
		List<Person> persons = handler.getPersons();
		for(Person p:persons) {
			System.out.println(p.getName()+"---"+p.getAge());
		}
	}
}

class PersonHandler extends DefaultHandler{
	private List<Person> persons;
	private Person person;
	private String tag;
	
	@Override
	public void startDocument() throws SAXException {
		persons = new ArrayList<Person>();
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		tag = qName;
		if(tag.equals("person")){
			person = new Person();
		}
	}
	
	//每次调用startElement和endElement方法后都会调用characters方法
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String str = new String(ch,start,length).trim();
		if(str!=null&&str.length()>0) {			
			if(tag.equals("name")) {
				person.setName(str);
			}else if(tag.equals("age")){
				person.setAge(Integer.valueOf(str));
			}
		}
	}
	
	public List<Person> getPersons() {
		return persons;
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName.equals("person")) {
			persons.add(person);
		}
	}
	
	
}