package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import POM.LogIn;
import POM.LogOut;

public class BaseClass {
	public WebDriver driver;
	@BeforeSuite
	public void bc()
	{
		
		
	}
	
	
	@BeforeClass
	public void bs()
	{
			driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demo.actitime.com/login.do");
			
		
		
	}
	
	@BeforeMethod
	public void bm()
	{
		LogIn login = new LogIn(driver);


		login.loginAction("admin", "manager");
		System.out.println("Loged in the application");
		
	}
	
	
	@AfterMethod
	public void am()
	{LogOut logout = new LogOut(driver);
	logout.LogOutAction();
	
		System.out.println("Logged out the app ");
		
	}
	
	@AfterClass
	public void ac()
	{
		driver.quit();
		System.out.println("The browser has been closed");
	}
	@AfterSuite
	public void as()
	{
		
		System.out.println("The database connection has been closed");
	}
	
	

}
