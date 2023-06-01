package PracticeWEbdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetDimensions {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	// fetching the dimensions
	Dimension dimensions = driver.manage().window().getSize();
	System.out.println(dimensions );
	// finding height of a Browser
	int Xcoordinate=dimensions.getHeight();
	int Ycoordinate=dimensions.getWidth();
	System.out.println(Xcoordinate);
	System.out.println(Ycoordinate);
}
}
