package PractiseWebDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateBrowserHistory {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.google.co.in/");
Thread.sleep(2000);
driver.navigate().to("https://www.amazon.in/");
Thread.sleep(2000);
driver.navigate().back();


	}

}
