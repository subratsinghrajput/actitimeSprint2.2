package locatus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXpath {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("file:///C:/Users/MohinishRajput/Downloads/xpath.html");
    WebElement textField = driver.findElement(By.xpath("html/body/div[1]/input[1]"));
    textField.sendKeys("Subrat");
	}

}
