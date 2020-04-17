package POMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.TakeScreenShot;

public class LoginPage {	
	public WebDriver driver;
	@FindBy(xpath="//a[@class='social-login'][contains(text(),'Sign In')]")
	WebElement btn_SignIn;
	@FindBy(xpath="//input[@id='social_login_email']")
	WebElement UserName;
	@FindBy(xpath="//input[@id='social_login_pass']")
	WebElement PassWord;
	@FindBy(xpath="//button[@id='bnt-social-login-authentication']")
	WebElement btn_login;
	
	public void LoginPage()
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
				
	}
	public void loginToApplication(String username,String password) {
		btn_SignIn.click();
		UserName.sendKeys(username);
		PassWord.sendKeys(password);
		btn_login.click();
		
	}
	

}
