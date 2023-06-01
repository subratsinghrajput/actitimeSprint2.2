package WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateSubUrl {
	public static void main(String[] args) throws MalformedURLException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		// navigate to subUrl
		URL SubUrl= new URL("http://www.oracle.com/in/");
		driver.navigate().to(SubUrl);
		
		
	}

}
