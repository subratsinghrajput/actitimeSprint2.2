package WebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPosition {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		Point pos = driver.manage().window().getPosition();
		int xcordinate=pos.getX();
		int Ycoordinate=pos.getY();
		System.out.println("x co-"+xcordinate);
		System.out.println( "y co-"+Ycoordinate);
		
	}

}
