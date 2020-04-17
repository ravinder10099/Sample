package Utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class readFromExcel {
	
	public static String readExcel(String sheetName,String key)
	{
		String value = null;
		try
		{
			File f = new File("D://test-data//DemoData.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet st = wb.getSheet(sheetName);
			System.out.println(st);
			int rowCount=st.getPhysicalNumberOfRows();
			int row=0;
			int col=0;
			row:
				for(int i=0;i<rowCount;i++)
				{
					Row r=st.getRow(i);
					cell:
						for(int j=0;j<r.getPhysicalNumberOfCells();j++)
						{
							String c= r.getCell(j).getStringCellValue();
							if(c.equalsIgnoreCase(key))
							{
								row=i;
								col=j;
								break row;
							}
						}
				}
			value=st.getRow(row).getCell(col+1).getStringCellValue();
			System.out.println(value);
			fis.close();
			//Reporter.log("Test Data is: "+value,true);
			return value;
		}
		catch(Exception e)
		{
			value="";
			return value;
		}
		
	}	

	
	

}
