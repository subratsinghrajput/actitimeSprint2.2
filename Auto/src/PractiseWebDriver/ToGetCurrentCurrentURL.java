package PractiseWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCurrentCurrentURL {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
	}

}
