package MavenDemo.MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import PageClasses.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestClass {
	
	static WebDriver driver;
	
	LoginPage log;
	
	@BeforeSuite
	public void launchUrl()
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		
		driver=new ChromeDriver(option);
		
		driver.get("https://kite.zerodha.com/");
	}
	
	@BeforeClass
	public void createObject()
	{
		log=new LoginPage(driver);
	}
	
	  

}
