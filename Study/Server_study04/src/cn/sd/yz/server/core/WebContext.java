package cn.sd.yz.server.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebContext {
	private List<Entity> entitys;
	private List<Mapping> mappings;
	//key--->servlet-name  value--->class
	private Map<String,String> entityMap = new HashMap<>();
	//key--->pattern  value--->servlet-name
	private Map<String,String> mappingMap = new HashMap<>();
	
	public WebContext(List<Entity> entitys, List<Mapping> mappings) {
		super();
		this.entitys = entitys;
		this.mappings = mappings;
		
		for(Entity entity:entitys) {
			entityMap.put(entity.getName(), entity.getClz());
		}
		
		for(Mapping mapping:mappings) {
			for(String pattern:mapping.getPatterns()) {				
				mappingMap.put(pattern, mapping.getName());
			}
		}
	}
	
	public String getClz(String pattern) {
		String name = mappingMap.get(pattern);
		return entityMap.get(name);
	}
}
