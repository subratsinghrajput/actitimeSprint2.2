package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToDeSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demoqa.com/select-menu");

WebElement carDropDown = driver.findElement(By.id("cars"));

Select select = new Select(carDropDown);

select.deselectByVisibleText("Audi");
Thread.sleep(2000);
select.deselectByVisibleText("volvo");
Thread.sleep(2000);

select.deselectByVisibleText("Saab");





	}

}
