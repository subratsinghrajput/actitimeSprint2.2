package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheURL {public static void main(String[] args) {
	//Launch the ChromeDriver
	ChromeDriver driver= new ChromeDriver();
	// nevigate the selenium url
	driver.get("https://www.selenium.dev/")
	;
	String url=driver.getCurrentUrl();
	// print the url in console
	System.out.println(url);
	//verifying the proper url is or not
	if(url.contains("selenium")){
		System.out.println("pass:url is passed");
		
		
	}
	else
	{
		System.out.println("fail:url is not passed");
	}
	driver.close();
}

}
