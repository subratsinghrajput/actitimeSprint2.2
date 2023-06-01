package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ColorToSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://demoqa.com/select-menu");
WebElement colorDropDownn = driver.findElement(By.id("oldSelectMenu"));

Select select = new Select(colorDropDownn);
boolean multipleSelect = select.isMultiple();

if(multipleSelect)
{
	System.out.println("Pass:the dropdownIs multiple Select");
}
else
{
	System.out.println("Fail:the dropdownIs singleSelect");
}


	}

}
