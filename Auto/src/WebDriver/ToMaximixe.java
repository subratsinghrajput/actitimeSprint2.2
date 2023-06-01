package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximixe {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.manage().window().minimize();
		//Thread.sleep(5000);
		
	}

}
