package PracticeWEbdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTitleofAmazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	String TitleOfAmazon = driver.getTitle();
	System.out.println(TitleOfAmazon);
	if(TitleOfAmazon.contains("Amazon")) {
		System.out.println("Pass: it is verified");
		
		
	}else {System.out.println("Fail: it is not verified");}

	}

}
