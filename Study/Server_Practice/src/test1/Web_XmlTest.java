package test1;

import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class Web_XmlTest
{
	public static void main(String[] args) throws Exception 
	{
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		WebHandler handler = new WebHandler();
		parser.parse(Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("test1/web.xml"), handler);
		
		List<Entity> entitys = handler.getEntitys();
		List<Mapping> mappings = handler.getMappings();
		
		WebContext context = new WebContext(entitys, mappings);
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String path = context.getClz(input);
		Servlet servlet = (Servlet) Class.forName(path).getConstructor().newInstance();
		servlet.service();
	} 
}
