package PracticeWEbdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetNewPosition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	ChromeDriver driver	=new ChromeDriver();
	Point pos = new Point(10,10);
	Thread.sleep(3000);
	driver.manage().window().setPosition(pos);

	}

}
