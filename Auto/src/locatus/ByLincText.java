package locatus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLincText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/MohinishRajput/OneDrive%20-%20Inspira%20Enterprise%20India%20Private%20Limited/Desktop/automation.html");
		WebElement link = driver.findElement(By.linkText("Goto Selenium"));
		link.click();
		
	}

}
