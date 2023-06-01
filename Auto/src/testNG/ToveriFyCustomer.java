package testNG;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToveriFyCustomer extends BaseClass{
	@Test
	public void demo1()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));

		wait.until(ExpectedConditions.titleContains("Enter"));
		String homepagetitle = driver.getTitle();
		Assert.assertTrue(homepagetitle.contains("Enter"));
		System.out.println("Pass: the home page has been varified");
		
		System.out.println("The customer has been verified");

	}

}
