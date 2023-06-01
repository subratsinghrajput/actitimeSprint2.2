package PracticeWEbdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheCurrrentURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
String URL = driver.getCurrentUrl();
System.out.println(URL);
if(URL.contains("amazon")) {
	System.out.println("Pass: it is valid URL");
	
	
}else {System.out.println("FaIL: it is npot valid url");}
	}

}
