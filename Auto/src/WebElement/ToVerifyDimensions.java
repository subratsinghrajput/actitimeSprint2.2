package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDimensions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement usertext = driver.findElement(By.id("username"));
		WebElement passText = driver.findElement(By.name("pwd"));
		 Dimension userdimensions = usertext.getSize();
		Dimension passdimensions = passText.getSize();
		System.out.println(userdimensions);
		System.out.println(passdimensions);
		int usernameHeight = userdimensions.getHeight();
		System.out.println("Height "+usernameHeight);
		int usernameWidth = userdimensions.getWidth();
		System.out.println("width "+usernameWidth);
		int passwordHeight = passdimensions.getHeight();
		int passwordWidth = passdimensions.getWidth();
		
		if(usernameHeight==passwordHeight&&usernameWidth==passwordWidth)
		{
			System.out.println("pass");
		}
		else {
			System.out.println("Fail");
		}
		
	}

}
