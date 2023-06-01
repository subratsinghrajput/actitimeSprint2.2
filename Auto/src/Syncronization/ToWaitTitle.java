package Syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToWaitTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 driver.get("https://demo.actitime.com/login.do");
 String titleOfLogin = driver.getTitle();
 driver.findElement(By.id("username")).sendKeys("admin");
 driver.findElement(By.name("pwd")).sendKeys("manager");
 driver.findElement(By.xpath("//div[text()='Login ']")).click();
 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
 wait.until(ExpectedConditions.titleContains("Enter"));
 String TitleofHomePage = driver.getTitle();
 System.out.println("Titlr of login"+titleOfLogin);
 
 System.out.println("Titlr of login"+TitleofHomePage );
 
	}

}
