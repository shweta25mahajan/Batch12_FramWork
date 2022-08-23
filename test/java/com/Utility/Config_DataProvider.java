package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Config_DataProvider {
	Properties pro;
	public Config_DataProvider() throws Exception {
		
	  String path="C:\\Users\\HP\\eclipse-workspace\\Batch12_FrameWork\\Config\\config.properties";
	  FileInputStream fis=new FileInputStream(path);
	   pro=new Properties();
	  pro.load(fis);
			
	}
	 public String  get_Baseurl_QA1() {
		 return pro.getProperty("Baseurl_QA1");
	 }
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
