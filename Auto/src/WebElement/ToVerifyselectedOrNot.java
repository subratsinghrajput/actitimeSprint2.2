package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyselectedOrNot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://demo.actitime.com/login.do");
 WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
 Thread.sleep(3000);
 checkbox.click();
 boolean selected = checkbox.isSelected();
 if(selected)
    {
	 System.out.println("Pass: the checkbox is selected");
	 
    }else {
    	System.out.println("fail: the checkbox is not selected");
    }
 
 
 
	}

}
