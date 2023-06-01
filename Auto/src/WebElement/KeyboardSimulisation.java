package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardSimulisation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demo.actitime.com/login.do");
     WebElement usernameText = driver.findElement(By.id("username"));
                         WebElement userPass = driver.findElement(By.name("pwd"));
	
                         usernameText.sendKeys("admin");
                         userPass.sendKeys("manager");
                         userPass.sendKeys(Keys.ENTER);
                         Thread.sleep(4000);
WebElement displayedTaskElement = driver.findElement(By.xpath("//div[text()='Tasks']"));

boolean displayed = displayedTaskElement.isDisplayed();

if(displayed)
{
System.out.println("Pass:element is displayed");	
}
else
{
	System.out.println("Fail :element is not displayed");
}
	}

}
