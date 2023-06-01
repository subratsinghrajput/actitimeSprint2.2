package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		// Launching Empty chrome driver;
		ChromeDriver driver=new ChromeDriver();
		// naVIGATE the actiTime
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		Thread.sleep(5000);
		// quit the Program
		driver.quit();

	}

}
