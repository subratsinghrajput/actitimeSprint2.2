package ActionClass;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.selenium.dev/");
Actions action = new Actions(driver);
action .sendKeys(Keys.PAGE_DOWN).perform();
action .sendKeys(Keys.PAGE_DOWN).perform();
Thread.sleep(3000);
action .sendKeys(Keys.PAGE_UP).perform();
	}

}
