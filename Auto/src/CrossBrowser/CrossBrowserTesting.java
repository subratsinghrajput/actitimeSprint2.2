package CrossBrowser;

import org.openqa.selenium.WebDriver;

public class CrossBrowserTesting {
public static void test(WebDriver driver)
   {driver.get("https://www.google.com/");
  String title = driver.getTitle();
  if(title.contains("Google")) 
      {
	  
	  System.out.println("Pass it is verified");
      }
  else {	  System.out.println("fail: it is not verified");}
	
		
   }
}
