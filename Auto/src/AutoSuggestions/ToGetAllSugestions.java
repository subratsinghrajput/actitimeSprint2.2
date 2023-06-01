package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class ToGetAllSugestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 driver.findElement(By.name("q")).sendKeys("selenium");
		List<WebElement> AllSuggestions = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		 
		int numberOfSuggestions = AllSuggestions.size();
		
		for(WebElement suggestion:AllSuggestions)
	         {
			System.out.println(suggestion.getText());
			
			
	         }
		
	}

}
