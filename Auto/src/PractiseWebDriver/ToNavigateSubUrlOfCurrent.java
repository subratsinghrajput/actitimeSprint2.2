package PractiseWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateSubUrlOfCurrent {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		URL subUrl = new URL("https://www.flipkart.com/");
		driver.navigate().to( subUrl);
	}

}
