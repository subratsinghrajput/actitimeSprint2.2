package PRACTISE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckBoxIsSelectedOrNot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver  driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 driver.get("https://demo.actitime.com/login.do");
 WebElement checkbox = driver.findElement(By.id("keepLoggedInLabel"));
 
 checkbox.click(); 
 boolean selected = checkbox.isSelected();
 if(selected)
 {
	 System.out.println("Pass:checkBox is selected");
	 
 }
 else
 {
	 
	 System.out.println("Fail:CheckBox is not selected");
 }
 
 
 
 
	}

}
