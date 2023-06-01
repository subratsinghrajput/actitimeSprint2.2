package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogetDimension {public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	// fetching the Dimension of Browser;
	  Dimension dimension=driver.manage().window().getSize();
	  System.out.println(dimension);
	  //fetching the height of Browser;
	  int height=dimension.getHeight();
	  System.out.println("Height is "+ height);
	  // fetching the height of browser.
	  int width= dimension.getWidth();
	  System.out.println("width is "+width );
}

}
