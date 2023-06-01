package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTheParentBrowser {public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://demo.actitime.com/login.do");
	
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	
	Thread.sleep(5000);
	driver.close();
	
	
}

}
