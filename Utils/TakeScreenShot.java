package Utils;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {
	
	public void TakeScreenShot(WebDriver driver) throws IOException
	{
		TakesScreenshot scrShot = (TakesScreenshot)driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		String FileWithPath = "D:\\ScreenShots\\SnapShot_login.jpg";
		File destFile = new File(FileWithPath);
		FileUtils.copyFile(srcFile, destFile);
				
	}

}
