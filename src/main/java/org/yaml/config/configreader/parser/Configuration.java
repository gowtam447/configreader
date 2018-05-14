package org.yaml.config.configreader.parser;

import java.util.List;

public class Configuration 
{
	private List< String > indexes;
	private List< String > views;
	
	public List<String> getIndexes() {
		return indexes;
	}
	
	public void setIndexes(List<String> indexes) {
		this.indexes = indexes;
	}
	
	public List<String> getViews() {
		return views;
	}
	
	public void setViews(List<String> views) {
		this.views = views;
	}

}