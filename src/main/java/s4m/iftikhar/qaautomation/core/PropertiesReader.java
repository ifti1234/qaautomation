package s4m.iftikhar.qaautomation.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@SuppressWarnings("serial")
public class PropertiesReader extends Properties {

	public static PropertiesReader config = new PropertiesReader();

	static {
		loadAllProperties();
	}

	public static void loadAllProperties() {

		try {
			config.load(new FileInputStream(new File("./config.properties")));
			System.out.println("Loaded config.properties");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getValue(String key) {

		if (containsKey(key))
			return getProperty(key);
		else {
			System.out.println(key + " property not present in one of the properties file.");
			return "";
		}

	}

}
