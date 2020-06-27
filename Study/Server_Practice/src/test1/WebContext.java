package test1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WebContext 
{
	private List<Entity> entitys;
	private List<Mapping> mappings;
	private Map<String, String> entitys_map;
	private Map<String, String> mappings_map;
	public WebContext(List<Entity> entitys, List<Mapping> mappings) 
	{
		super();
		this.entitys = entitys;
		this.mappings = mappings;
	
		entitys_map = new HashMap<String, String>();
		mappings_map = new HashMap<String, String>();
		
		for(Entity entity:entitys) 
		{
			entitys_map.put(entity.getName(), entity.getClz());
		}
		
		for(Mapping mapping:mappings) {
			for(String pattern:mapping.getPatterns())
			{				
				mappings_map.put(pattern,mapping.getName());
			}
		}
	}
	
	public String getClz(String str)
	{
		String name = mappings_map.get(str);
		return entitys_map.get(name);
	}
	
}
