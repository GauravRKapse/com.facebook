package com.facebook.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.facebook.constants.constants;

public class propertiesFile {
	
	public static String properties(String key) {
		String value= null;
		try {
			FileInputStream fis= new FileInputStream("input/objectRepository.properties");
			constants.prop= new Properties();
			constants.prop.load(fis);
			value= constants.prop.getProperty(key);
		} catch (FileNotFoundException e) {
			System.out.println("unable to open objectRepository.properties");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}

}
