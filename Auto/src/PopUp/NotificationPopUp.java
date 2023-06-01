package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Key;

public class NotificationPopUp {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://www.yatra.com/");

Robot robot = new Robot();

robot.keyPress(KeyEvent.VK_TAB);
robot.keyPress(KeyEvent.VK_ENTER);

 
robot.keyRelease(KeyEvent.VK_TAB);
robot.keyRelease(KeyEvent.VK_TAB);



	}

}
