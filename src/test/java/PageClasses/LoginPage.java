package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='userid']")
	private WebElement userId;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy (xpath="//input[@type='text']")
	private WebElement otpnumber;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement continueButton;
	
	// To initialize the driver for current class
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements( driver, this);
	}
	
	public void logInZerodha() throws InterruptedException
	{
		userId.sendKeys("LGD943");
		password.sendKeys("shree@1234");
		loginButton.click();
		Thread.sleep(3000);
		otpnumber.sendKeys("123456");
		continueButton.click();
	}
	
	

}
