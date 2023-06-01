package PRACTISE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetErrorMsgIfWweEnterWrongNmae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.id("username")).sendKeys("adgsv");
driver.findElement(By.xpath("//div[text()='Login ']")).click();
String actualtext = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']")).getText();
System.out.println(actualtext);
String ExpectedResult="Username or Password is invalid. Please try again.";

if( actualtext.contains(ExpectedResult))
{
System.out.println("Pass:Error is verified");

}

else {
	
	System.out.println("Fail:Error is not verified");
}
driver.quit();
	}

}
