package Xpathtext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxis {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/s?k=iphone&crid=15HAXKADH6ULX&sprefix=iphon%2Caps%2C517&ref=nb_sb_noss_2");
	
	WebElement fatch = driver.findElement(By.xpath("//span[text()='Apple iPhone 14 (128 GB) - Yellow']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[text()='71,999']"));
	String show = fatch.getText();
	
	System.out.println(show);
	}

}
