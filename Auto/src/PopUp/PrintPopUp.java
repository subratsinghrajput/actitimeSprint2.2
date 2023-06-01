package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class PrintPopUp {

	public static void main(String[] args) throws AWTException, InterruptedException, FindFailed {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.facebook.com/");
	
	Robot robot = new Robot();
	 robot.keyPress(KeyEvent.VK_CONTROL);
	 robot.keyPress(KeyEvent.VK_P);
	 
	 Thread.sleep(2000);
	 
	 robot.keyRelease(KeyEvent.VK_CONTROL);
	 robot.keyRelease(KeyEvent.VK_P);
	 
	 robot.keyPress(KeyEvent.VK_ENTER);
	 robot.keyRelease(KeyEvent.VK_ENTER);
	 Pattern filename = new Pattern("C:\\Users\\MohinishRajput\\OneDrive - Inspira Enterprise India Private Limited\\Desktop\\Selenium1pmBatch\\Auto\\Testdata\\Filename2.png");
	 Pattern savebutton = new Pattern("C:\\Users\\MohinishRajput\\OneDrive - Inspira Enterprise India Private Limited\\Desktop\\Selenium1pmBatch\\Auto\\Testdata\\save1.png");
	 
	Screen screen = new Screen();
	
	screen.wait(filename,20); 
	screen.type(filename,"subratsingh");
	screen.click( savebutton);
	
	}

}
