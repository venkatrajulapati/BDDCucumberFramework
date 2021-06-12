package com.app.libs.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class commonUtils{
	
	public static String getPropertyValue(String propfilePath,String propName) {
		File f = new File(propfilePath);
		FileInputStream iStream=null;
		Properties prop=null;
		try {
			iStream = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		prop = new Properties();
		try {
			prop.load(iStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop.getProperty(propName).toString();
	}
	
	
}
