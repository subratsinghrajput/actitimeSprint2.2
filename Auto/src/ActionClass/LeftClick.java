package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import CrossBrowser.Driver;

public class LeftClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
 driver.get("https://demo.actitime.com/login.do");
 WebElement ChecBox = driver.findElement(By.id("keepLoggedInLabel"));
 Actions action = new Actions(driver);
 action.click(ChecBox).perform();
	}

}
