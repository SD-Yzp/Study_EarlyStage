package test1;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class WebHandler extends DefaultHandler 
{
	private List<Entity> entitys;
	private List<Mapping> mappings;
	private Entity entity;
	private Mapping mapping;
	private String tag;
	private boolean isMapping;
	
	@Override
	public void startDocument() throws SAXException 
	{
		entitys = new ArrayList<Entity>();
		mappings = new ArrayList<Mapping>();
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException 
	{
		tag = qName;
		if(tag.equals("servlet")) 
		{
			entity = new Entity();
			isMapping = false;
		}
		else if(tag.equals("servlet-mapping")) 
		{
			mapping = new Mapping();
			isMapping = true;
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException 
	{
		String contents = new String(ch,start,length).trim();
		if(contents!=null&&contents.length()>0) 
		{
			if(!isMapping)
			{
				if(tag.equals("servlet-name")) 
				{
					entity.setName(contents);
				}
				else if(tag.equals("servlet-class")) 
				{
					entity.setClz(contents);
				}
			}
			else 
			{
				if(tag.equals("servlet-name")) 
				{
					mapping.setName(contents);
				}
				else if(tag.equals("url-pattern")) 
				{
					mapping.addPattern(contents);
				}
			}
		}
	}
	
	public List<Entity> getEntitys() {
		return entitys;
	}

	public List<Mapping> getMappings() {
		return mappings;
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException 
	{	
		if(qName.equals("servlet"))
		{
			entitys.add(entity);
		}
		if(qName.equals("servlet-mapping"))
		{
			mappings.add(mapping);
		}
	}
}
