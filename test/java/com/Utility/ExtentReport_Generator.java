package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport_Generator {
	public static ExtentReports extent;
	public static ExtentReports getReport() {
		String path="C:\\Users\\HP\\eclipse-workspace\\Batch12_FrameWork\\Reports\\index.html";
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setDocumentTitle("Automation Test Report");
		report.config().setReportName("Test Report");
		report.config().setTheme(Theme.DARK);
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Project Name", "Test_Batch");
		extent.setSystemInfo("OS", "Window");
		extent.setSystemInfo("Tool", "Selenum-WebDriver");
		extent.setSystemInfo("QA", "Shweta Mahajan");
		return extent;
		
	}
	
	
	
	
	
	
	
	
	
	

}
