import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateBrowserHistory {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
Thread.sleep(3000);
driver.navigate().to("https://www.amazon.com/");
Thread.sleep(3000);
driver.navigate().forward();
Thread.sleep(3000);
driver.navigate().back();

Thread.sleep(3000);
driver.navigate().refresh();

	}

}
