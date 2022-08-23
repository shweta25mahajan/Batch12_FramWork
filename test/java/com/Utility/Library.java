package com.Utility;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
      public static ExtentTest test;
      
	public static void custom_sendkyes(WebElement element,String value,String fieldname) {
		try {
		element.sendKeys(value);
		test.log(Status.PASS, value + "Value Successfully Send...."+fieldname);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
			
		}
	}
		public static void Custom_click(WebElement element1,String fieldname)	{	
			try {
				element1.click();
				test.log(Status.PASS, "Clicked successfully..."+fieldname);
			}catch(Exception e) {
				test.log(Status.FAIL, e.getMessage());
				
			}
		}
		
		public static void Custom_HandleDropDown(WebElement element,String text) {
			try {
			Select sel=new Select(element);
			sel.selectByVisibleText(text);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
				}
		 public static void Custom_HandleMouse_over_click(WebDriver driver,WebElement element) {
			 
			 try {
			 Actions act=new Actions(driver);
			 act.moveToElement(element).click().build().perform();
			 }catch(Exception e) {
				 System.out.println(e.getMessage());
			 }
		 }
	
	
	
	
	
	
	
	
	
}
