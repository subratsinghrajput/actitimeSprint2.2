package PractiseWebDriver;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchOneBrowserWindowToanotherWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.switchTo().newWindow(WindowType.TAB);
driver.navigate().to("https://www.amazon.com/");


	}
}