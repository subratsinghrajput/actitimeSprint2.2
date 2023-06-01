package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToverifyAllignmentIssue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/MohinishRajput/OneDrive%20-%20Inspira%20Enterprise%20India%20Private%20Limited/Desktop/automation.html");
	Point usernameLocation = driver.findElement(By.id("123")).getLocation();
	Point passwordLocation = driver.findElement(By.name("sanjit")).getLocation();
	System.out.println(usernameLocation);
	System.out.println( usernameLocation);
	int usernameX = usernameLocation.getX();
	int PasswordX =passwordLocation.getX();
	if(usernameX==PasswordX)
	{
		System.out.println("Pass:allignment is proper");	
	}
	else {	System.out.println("Fail:allignment is not proper");	}
	}

}
