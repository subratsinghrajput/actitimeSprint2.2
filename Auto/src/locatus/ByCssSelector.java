package locatus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/MohinishRajput/OneDrive%20-%20Inspira%20Enterprise%20India%20Private%20Limited/Desktop/automation.html");
WebElement checkBox = driver.findElement(By.cssSelector("input[type='checkbox']"));
checkBox.click();
Thread.sleep(3000);
checkBox.click();
Thread.sleep(3000);
checkBox.click();
	}

}
