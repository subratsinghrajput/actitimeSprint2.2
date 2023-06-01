package PracticeWEbdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAmazon {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}

}
