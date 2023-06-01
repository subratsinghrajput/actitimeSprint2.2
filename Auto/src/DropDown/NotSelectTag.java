package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NotSelectTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demoqa.com/select-menu");
WebElement DropDown = driver.findElement(By.xpath("//div[text()='Select Option']"));
Actions action = new Actions(driver);
action.sendKeys(DropDown, " a root ").sendKeys(Keys.ENTER).perform();




	}

}
