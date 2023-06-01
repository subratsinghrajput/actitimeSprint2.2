package PractiseWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTtitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
String titleOfWebPage = driver.getTitle();
System.out.println(titleOfWebPage);
	}

}
