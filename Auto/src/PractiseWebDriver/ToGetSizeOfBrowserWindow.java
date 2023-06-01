package PractiseWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSizeOfBrowserWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ChromeDriver driver = new ChromeDriver();
 
 Dimension dimension = driver.manage().window().getSize();
 System.out.println(dimension );
Object height = dimension.getHeight();
System.out.println("height is "+height );
int width = dimension.getWidth();
System.out.println("Widgth is "+width );
	}

}
