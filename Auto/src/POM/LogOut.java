package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	public LogOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Logout")
	 public WebElement logoutButton;
	
	public void LogOutAction()
	{
		
		logoutButton.click();
	}
	
	
	

}
