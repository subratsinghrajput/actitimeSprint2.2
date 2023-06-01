package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JAvaScriptPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demoqa.com/alerts");

driver.findElement(By.id("alertButton")).click();
Thread.sleep(2000);
driver.switchTo().alert().accept();

driver.findElement(By.id("confirmButton")).click();
driver.switchTo().alert().dismiss();

Thread.sleep(2000);
new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
driver.findElement(By.id("promtButton"));
Alert alert = driver.switchTo().alert();
String alertmas = alert.getText();
alert.sendKeys("Qspder");
alert.accept();
System.out.println(alertmas);



	}

}
