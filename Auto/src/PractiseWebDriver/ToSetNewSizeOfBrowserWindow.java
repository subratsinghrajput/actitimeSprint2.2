package PractiseWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetNewSizeOfBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
Dimension dime = new Dimension(500, 800);
Thread.sleep(3000);
driver.manage().window().setSize(dime);

	}

}
