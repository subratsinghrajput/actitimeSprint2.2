package PracticeWEbdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
String source = driver.getPageSource();
System.out.println(source );
	}

}
