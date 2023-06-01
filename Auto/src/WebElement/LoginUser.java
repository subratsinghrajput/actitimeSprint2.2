package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://demo.actitime.com/login.do");
       WebElement nameText = driver.findElement(By.id("username"));
       WebElement PassText = driver.findElement(By.name("pwd"));
       nameText.sendKeys("admin");
       PassText.sendKeys("manager");
       PassText.sendKeys(Keys.ENTER);
       
       
       
	}

}
