package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    public static   WebDriver driver;
   public static  Config_DataProvider config;
   public static Excel_DataProvider excel;
   
    @BeforeSuite
    public void BS() throws Exception {
    	config=new Config_DataProvider();
    	  excel=new Excel_DataProvider();
    }
     
    
	@BeforeMethod
	public void Test1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(config.get_Baseurl_QA1());
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
