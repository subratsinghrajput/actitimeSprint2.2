package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToParentWindow {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actiTime.com/login.do");
		String ParentId = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allId = driver.getWindowHandles();
		for(String id:allId){
			driver.switchTo().window(id);
			if(!id.equals( ParentId)){String TitleofChild = driver.getTitle();
				Thread.sleep(5000);
			System.out.println( TitleofChild  );
			//driver.close();
			}
			
			
		}
		driver.switchTo().window(ParentId);
		String TitleofParent = driver.getTitle();
		System.out.println( TitleofParent  );
		

	}
	

}
