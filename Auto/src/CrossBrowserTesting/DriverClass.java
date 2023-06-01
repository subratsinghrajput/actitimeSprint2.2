package CrossBrowserTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassA.test(new ChromeDriver());
System.out.println("Application has been tested on Chrome Browser");
ClassA.test(new EdgeDriver());
System.out.println("Application has been tested on Edge Browser");

	}

}
