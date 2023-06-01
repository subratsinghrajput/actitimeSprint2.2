package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVeriFyTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
	String Tagname = checkbox.getTagName();
	System.out.println(Tagname);
	if(Tagname.equals("input")) {
		checkbox.click();
	}
	else {
		System.out.println("Fail");
	}

	}

}
