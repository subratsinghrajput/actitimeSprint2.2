package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;


public class ClassA {
public static void test(WebDriver driver)
{
driver.manage().window().maximize();
driver.get("https://www.google.co.in/");

String expectedTitle = "Google";
String actualTitle = driver.getTitle();
if(actualTitle.contains(expectedTitle))
{
	
System.out.println("pass:Actual result is equal to expected result");

}
else {System.out.println("fail:Actual result is not equal to expected result ");}
driver.quit();



}


}

