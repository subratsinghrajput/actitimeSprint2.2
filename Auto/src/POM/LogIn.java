package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	
	public LogIn(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	public WebElement usernameTextField;
	
	@FindBy(name="pwd")
	public WebElement PasswordUsernameText;
	
	@FindBy(xpath ="//div[text()='Login ']")
	public WebElement LoginButton;  
	
	public void loginAction(String username,String password)
	{ 
		usernameTextField.sendKeys(username);
		PasswordUsernameText.sendKeys(password);
		LoginButton.click();
	}
 
}
