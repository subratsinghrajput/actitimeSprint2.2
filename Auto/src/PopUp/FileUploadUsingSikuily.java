package PopUp;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;




public class FileUploadUsingSikuily {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
Pattern filename = new Pattern("C:\\Users\\MohinishRajput\\OneDrive - Inspira Enterprise India Private Limited\\Desktop\\Selenium1pmBatch\\Auto\\Testdata\\filename.png");
Pattern openbutton = new Pattern("C:\\Users\\MohinishRajput\\OneDrive - Inspira Enterprise India Private Limited\\Desktop\\Selenium1pmBatch\\Auto\\Testdata\\openbutton2.png");
Screen screen = new Screen();
screen.wait(filename,20);
screen.type(filename,"C:\\Users\\MohinishRajput\\OneDrive - Inspira Enterprise India Private Limited\\Desktop\\Selenium1pmBatch\\Auto\\Testdata\\filename.png");
screen.click(openbutton);
	}

}
