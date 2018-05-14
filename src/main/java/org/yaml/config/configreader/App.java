package org.yaml.config.configreader;

import java.io.IOException;
import java.util.List;

import org.yaml.config.configreader.parser.Configuration;
import org.yaml.config.configreader.parser.YamlConfigParser;


public class App 
{
	  public static void main(String[] args) throws IOException 
	  {
		  YamlConfigParser parser = new YamlConfigParser();
		  try
		  {
			  Configuration config  = parser.parseConfiguration("config/config.yml");
			  List<String> views = config.getViews();
			  
			  System.out.println("************* VIEWS **************");
			  for(String x : views)
			  {
				  System.out.println(x);
			  }
			  
			  List<String> indexes = config.getIndexes();
			  
			  System.out.println("************* INDEXES **************");
			  for(String x : indexes)
			  {
				  System.out.println(x);
			  }
		  }
		  catch(Exception e)
		  {
			 System.out.println(e.toString());
		  }
	  }
}
