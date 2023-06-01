package PRACTISE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PRASCTISE1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver= new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 driver.get("https://www.google.co.in/");
 driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("Tajmahal");
 Thread.sleep(3000);
 driver.findElement(By.xpath("//textarea[@name=\"q\"]")).clear();
 //driver.findElement(By.xpath("//input[@value=\"Google Search\"][1]")).click();
	}

}
