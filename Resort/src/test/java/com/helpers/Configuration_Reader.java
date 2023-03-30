package com.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	public Properties properties;
    public Configuration_Reader() throws Throwable  {
		File file = new File("C:\\Users\\Thasif Ahamed\\eclipse-workspace\\Resort\\src\\test\\java\\com\\helpers\\data.properties");
		FileInputStream fis = new FileInputStream(file);
		properties = new Properties();
		properties.load(fis);
	}
    
    public String getUrl() {
    String property = properties.getProperty("url");
	return property;
	}
}
