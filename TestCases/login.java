package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POMPages.LoginPage;
import Utils.GetData;
import Utils.TakeScreenShot;
import Utils.readFromExcel;

public class login {
	public WebDriver driver;
	

	@BeforeTest
    public void beforeTest() throws InterruptedException
    {
	System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.wilsonart.com");
	Thread.sleep(5000);
	driver.manage().window().maximize();
    }
	
	@Test
	//@Parameters({"UserName","PassWord"})
	public void loginApplication() throws InterruptedException, IOException
	{	
	
		
		LoginPage LP = PageFactory.initElements(driver, LoginPage.class);
		//LP.loginToApplication(GetData.FromProperties("Configuration", "UserName"), GetData.FromProperties("Configuration", "PassWord"));
		//readFromExcel read = new readFromExcel();
		LP.loginToApplication(readFromExcel.readExcel("Sheet1", "UserName"), readFromExcel.readExcel("Sheet1", "PassWord"));
		Thread.sleep(3000);
		TakeScreenShot TS = new TakeScreenShot();
		TS.TakeScreenShot(driver);
	}
	@AfterTest
	public void CloseApplication()
	{
		driver.quit();
	}

}