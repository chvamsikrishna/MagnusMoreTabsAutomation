package com.sf.test2;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Exceldata {

	
	public static void main(String[] args) throws IOException
	{
	
	File data = new File("");
	
	FileInputStream fs = new FileInputStream(data);

	XSSFWorkbook xs = new XSSFWorkbook(fs);
	
	  XSSFSheet sheetNumber = xs.getSheetAt(0);
	  
	    String s =sheetNumber.getRow(1).getCell(3).getStringCellValue();
	    
	    System.out.println(s);
	    
	    
	    
	    xs.close();

	   
}
}
