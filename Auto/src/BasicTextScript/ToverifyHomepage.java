package BasicTextScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.LogIn;
import POM.LogOut;

public class ToverifyHomepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		
		
LogIn login = new LogIn(driver);


login.loginAction("admin", "manager");
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));

wait.until(ExpectedConditions.titleContains("Enter"));
String homepagetitle = driver.getTitle();

if(homepagetitle.contains("Enter"))
{
System.out.println("page:title  is Varifed");	
}
else 
	System.out.println("fail:title is not verified");

LogOut logout = new LogOut(driver);
logout.LogOutAction();
driver.quit();

	}
	

	}
