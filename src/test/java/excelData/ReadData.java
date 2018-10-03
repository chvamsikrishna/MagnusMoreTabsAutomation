package excelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData{
	
@Test
public void excelRead() throws IOException
{
	File f = new File("C:\\Users\\Niranjan Sai\\Documents\\Sheets\\data-1.xls");
    FileInputStream fis = new FileInputStream(f);
  
    		
   HSSFWorkbook workbook = new HSSFWorkbook(fis);
   HSSFSheet sheet =  workbook.getSheetAt(0);
   String cellValue =   sheet.getRow(2).getCell(1).getStringCellValue();
   System.out.println(cellValue);
   workbook.close();                                                                                                                               
    
    
    
  }
}
	
