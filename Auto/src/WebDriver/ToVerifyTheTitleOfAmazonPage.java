package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheTitleOfAmazonPage {
	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		String TitleOfAmazon= driver.getTitle();
		System.out.println(TitleOfAmazon);
		if(TitleOfAmazon.contains("Amazon")){
			System.out.println("Pass: it is Verified");
			
		}
		else {
			System.out.println("Fail: it is not Verified");
		}
		 
		 
		 
		 
		 
	}


		
		


	

}
