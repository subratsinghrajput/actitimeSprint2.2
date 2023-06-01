package locatus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 // navigate the URL
      driver.get("file:///C:/Users/MohinishRajput/OneDrive%20-%20Inspira%20Enterprise%20India%20Private%20Limited/Desktop/automation.html");
      // identifying the Username textfield
      WebElement username = driver.findElement(By.id("123"));
      // passing the value in username TextField
      username.sendKeys("Subrat");
      // identifying the password TextField 
      WebElement Password = driver.findElement(By.name("sanjit"));
      // passing the Value in password TextField
      Password.sendKeys("Rajput@123");
      
	}

}
