package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_DataProvider {

	XSSFWorkbook wb;
	
	
	public Excel_DataProvider() throws Exception {
		String path="C:\\Users\\HP\\eclipse-workspace\\Batch12_FrameWork\\TestData\\Test.xlsx";
		FileInputStream fis1=new FileInputStream(path);
		 wb=new XSSFWorkbook(fis1);
		
}
	
	public String getStringData(String Sheetname,int row,int cell) {
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
