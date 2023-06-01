package DatadrivenData.TestData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchDataFromPropertiesdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fis =new FileInputStream("./Testdata/PropertyData.Properties");

Properties prop = new Properties();
prop.load(fis);

String url = prop.getProperty("url");
System.out.println(url );

String username = prop.getProperty("username");
System.out.println(username) ;

String password = prop.getProperty("password");
System.out.println(password);

 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 driver.get(url);
 
 driver.findElement(By.id("username")).sendKeys(username);
 driver.findElement(By.name("pwd")).sendKeys(password);
 driver.findElement(By.xpath("//div[text()='Login ']")).click();
 

	}

}
