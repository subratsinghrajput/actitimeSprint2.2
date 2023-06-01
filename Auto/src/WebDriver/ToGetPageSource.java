package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPageSource {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		String pageSource = driver.getPageSource();
		if(pageSource.contains("actitime")) {
			System.out.println("pase:page contains information");
			
				
		
		}
		else {
			System.out.println("fail:page does not contains information");
		}
		
	}

}
