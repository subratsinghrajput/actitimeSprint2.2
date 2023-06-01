package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToVerifyGoogle {
@Test
public void ToVerifyGoogle()
{
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
driver.get("https://www.google.co.in/");
if(driver.getTitle().equals("Google"))
{
System.out.println("pass");	
}
else {
	System.out.println("Fail");
	
}


	
	
}
}
