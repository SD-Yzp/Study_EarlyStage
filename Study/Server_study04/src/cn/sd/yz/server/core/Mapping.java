package cn.sd.yz.server.core;

import java.util.HashSet;
import java.util.Set;

public class Mapping {
	private String name;
	private Set<String> patterns;
	public Mapping() {
		patterns = new HashSet<String>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getPatterns() {
		return patterns;
	}
	public void setPatterns(Set<String> pattern) {
		this.patterns = pattern;
	}
	
	public void addPattern(String pattern){
		patterns.add(pattern);
	}
	
}
