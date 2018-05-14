package org.yaml.config.configreader.parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.yaml.snakeyaml.Yaml;

public class YamlConfigParser 
{

    public Configuration parseConfiguration(String yamlFilePath) throws IOException 
    {
        if( yamlFilePath != null && !yamlFilePath.trim().equals("")) 
        {
        	Yaml yaml = new Yaml();  
//        	String current = new java.io.File( "." ).getCanonicalPath();
        	String current = System.getProperty("user.dir");
            try( InputStream in = Files.newInputStream( Paths.get( current, yamlFilePath ) ) ) 
            {
                Configuration config = yaml.loadAs( in, Configuration.class );
                System.out.println( config.toString() );
                return config;
            }
        }
        return null;
    }
}