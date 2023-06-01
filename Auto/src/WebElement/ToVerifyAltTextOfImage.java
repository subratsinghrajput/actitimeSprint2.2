package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAltTextOfImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://demo.actitime.com/login.do");
 WebElement seconfImageOfSelenuim = driver.findElement(By.xpath("(//img[@class=\"rg_i Q4LuWd\"])[2]"));
 
String altOfTextImage = seconfImageOfSelenuim.getAttribute("alt");
if(altOfTextImage.contains("Selenium"))
   {
	
	System.out.println("Pass: alt text has been passed ");
   }
else {
	System.out.println("Fail: alt text has not been passed ");
	
}
 
	}

}
