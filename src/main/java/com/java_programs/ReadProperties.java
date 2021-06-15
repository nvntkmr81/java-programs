package main.java.com.java_programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	static Properties properties;

	public static String getPropertyValue(String key) {
		try {
			File file = new File(System.getProperty("user.dir")+"/src/resources/properties/data.properties");
			FileReader reader = new FileReader(file);
			properties = new Properties();
			properties.load(reader);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);
	}
}
