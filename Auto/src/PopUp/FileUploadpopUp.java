package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadpopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://fineuploader.com/demos.html");
		driver.findElement(By.xpath("//input[@title=\"file input\"]")).sendKeys("C:\\Users\\MohinishRajput\\OneDrive - Inspira Enterprise India Private Limited\\Desktop\\Selenium1pmBatch\\Auto\\Testdata\\f9c74dc0-da15-4448-ab20-7ab1e44366a5.jpg");
		

	}

}
