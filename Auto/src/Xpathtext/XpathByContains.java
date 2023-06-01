package Xpathtext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://selenium.dev/");
		WebElement para = driver.findElement(By.xpath("//p[contains(text(),'If you want to create robust, browser-based regression automation suites and tests, scale and\r\n"
				+ "distribute scripts across many environments, then you want to use Selenium WebDriver, a\r\n"
				+ "collection of language specific bindings to drive a browser - the way it is meant to be driven.')]"));
		 String link = para.getText();
		 System.out.println(link);
		 if(link.contains("robust"))
		 {
			 System.out.println("Pass:It contains robust");
		 }
		 else {

			 System.out.println("Fails:It does not contains robust");
		 }
		 }
	

}
