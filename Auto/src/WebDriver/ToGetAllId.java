package WebDriver;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAllId {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("https://www.facebook.com/");
	 Set<String> AllId = driver.getWindowHandles();
	 System.out.println(AllId);
}
}
