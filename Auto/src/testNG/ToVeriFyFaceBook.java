package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToVeriFyFaceBook {
@Test
public void ToVerifyFacebook()
{
	
WebDriver driver=new ChromeDriver();
driver .manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://hi-in.facebook.com/");
String titleoffacebook = driver.getTitle();
System.out.println(titleoffacebook);
if(titleoffacebook.contains("Facebook"))
{
System.out.println("Pass:HomePage is verified");	
}
else
{
	System.out.println("fail:HomePage is not  verified");		
}






}

}
