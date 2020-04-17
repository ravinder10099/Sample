package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utils.readFromExcel;

public class readDataFromExcel {
	
	@Test
	
	public void readData()
	{
		WebDriver driver;
		readFromExcel data = new readFromExcel();
		data.readExcel("Sheet1", "UserName");
				
	}

}
