package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVrtifyTheTitleofWebPage {public static void main(String[] args) {
	   ChromeDriver driver =new ChromeDriver();
	   driver.get("https://www.facebook.com");
String TitleofFacebook=driver.getTitle();
System.out.println(TitleofFacebook);
if(TitleofFacebook.contains("Facebook")) {
	System.out.println("Pass: the title verified");}
	else{System.out.println("Failed: the title is not verified");
		
	}
	
}

}

