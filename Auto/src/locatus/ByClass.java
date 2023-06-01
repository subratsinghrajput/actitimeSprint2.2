package locatus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClass {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver=	new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/MohinishRajput/OneDrive%20-%20Inspira%20Enterprise%20India%20Private%20Limited/Desktop/automation.html");
	WebElement classname = driver.findElement(By.className("header"));
	String text = classname.getText();
	System.out.println(text);
	}

}
