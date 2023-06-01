package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPassValueToDesebledTextField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 driver.get("https://demoapp.skillrary.com/");
 WebElement Disabletextfield = driver.findElement(By.xpath("//input[@class='form-control']"));
 JavascriptExecutor js =(JavascriptExecutor)driver;
 js.executeScript("arguments[0].value='subrat'",Disabletextfield );
 
	}

}
