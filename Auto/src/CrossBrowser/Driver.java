package CrossBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CrossBrowserTesting.test(new ChromeDriver()	);
System.out.println("the application has been tested on chrome");
//CrossBrowserTesting.test(new FirefoxDriver()	);
CrossBrowserTesting.test(new EdgeDriver()	);
System.out.println("the application has been tested on edge");
	}

}
