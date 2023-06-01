package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToChild {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actiTime.com/login.do");
		String ParentID = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc")).click();
		Set<String> allId = driver.getWindowHandles();
		for(String id:allId) 
		     {
			driver.switchTo().window(id);
			if(!id.equals(ParentID))
			{
				Thread.sleep(3000);
				driver.close();
			}
		     }
	}

}
