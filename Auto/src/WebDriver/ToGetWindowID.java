package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowID {
	public static void main(String[] args) {
		ChromeDriver driver1=new ChromeDriver();
		String windowID1 = driver1.getWindowHandle();
		System.out.println(windowID1);
	}

}
