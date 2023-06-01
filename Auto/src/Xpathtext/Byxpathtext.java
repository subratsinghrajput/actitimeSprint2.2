package Xpathtext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byxpathtext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.selenium.dev/");
       WebElement link = driver.findElement(By.xpath("//span[text()='Downloads']"));
       Thread.sleep(3000);
       link.click();
	}

}
