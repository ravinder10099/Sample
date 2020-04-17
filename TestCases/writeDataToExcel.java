package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utils.writeToExcel;

public class writeDataToExcel {

	@Test
	public void writeExcel() throws IOException
	{
		WebDriver driver;
		writeToExcel write = new writeToExcel();
		
		
		write.writeExcel();
	}
}
