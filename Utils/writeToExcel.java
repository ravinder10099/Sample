package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;

public class writeToExcel {
	
	public static void writeExcel() throws IOException
	{
	     try
	     {
			FileInputStream fis=new FileInputStream("D://test-data//Demo1.xlsx");
		    XSSFWorkbook wb= new XSSFWorkbook(fis);

		    //XSSFSheet sh= wb.getSheetAt(0); Or
		    XSSFSheet sh = wb.createSheet("Test1");
		    XSSFRow row=sh.createRow(0);
		    XSSFCell cell= row.createCell(0);
		    XSSFRow row1=sh.createRow(1);
		    //XSSFCell cell= row.createCell(0);
		    XSSFCell cell1=row1.createCell(1);

		    //cell.setCellType(cell.CELL_TYPE_STRING);
		    cell.setCellValue("Himaneesh");
		    cell1.setCellValue("SriChaitanya");

		    FileOutputStream fos=new FileOutputStream("D://test-data//Demo1.xlsx");
		    wb.write(fos);
		    fos.close();

		    System.out.println("Excel File Written successfully");			
			
		}
		catch(Exception e)
		{
			System.out.println("Unable to write into cell");
			
		}
		
	}
}
	




