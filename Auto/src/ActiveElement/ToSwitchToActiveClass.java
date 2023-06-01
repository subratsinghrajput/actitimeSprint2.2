package ActiveElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToActiveClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.switchTo().activeElement().sendKeys("selenium");

	}

}
