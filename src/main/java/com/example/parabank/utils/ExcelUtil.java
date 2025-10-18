package com.example.parabank.utils;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil
{
	
  public static Object[][] getData(String filepath,String sheetname) 
  {
	  Object[][] data=null;
	  try {
		  FileInputStream fis = new FileInputStream(filepath);
		  Workbook workbook = new XSSFWorkbook(fis);
		  Sheet sheet = workbook.getSheet(sheetname);
		  int rowCount = sheet.getPhysicalNumberOfRows();
		  int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		  data= new Object[rowCount-1][colCount];
		  DataFormatter format = new DataFormatter();
		  for (int i = 1; i < rowCount; i++) 
		  {
			Row row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++)
			{
				Cell cell = row.getCell(j);
				if (cell!=null)
				{
					data[i-1][j]=format.formatCellValue(cell);
				} else 
				{
                  data[i-1][j]="";
				}
			}
		} 
		  workbook.close();
	      } 
	  catch (Exception e) 
	  {
		e.printStackTrace();
	} 
	  return data;
  }
}

