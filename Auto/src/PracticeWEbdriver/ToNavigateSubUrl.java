package PracticeWEbdriver;






import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
//import java.net.MalformedURLException;

public class ToNavigateSubUrl {

	public static void main(String[] args) throws MalformedURLException {
	ChromeDriver driver	=new ChromeDriver();
	// to navigate mAIN URL
	driver.get("https://www.google.com/");
	// to navigate to subURL
	//URL subUrl = new URL("https://www.google.com/");
	 URL subUrl = new URL("https://www.oracle.com/in/");
	driver.navigate().to(subUrl);
	
	}

}
