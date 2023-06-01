package testNG;

import org.testng.annotations.Test;

public class G {
	
	@Test(groups="smoke",priority=4)
	public void sentMail()
	{
		System.out.println("user has sent the mail");
		
	}
	@Test(groups="compose",priority=5)
	public void logOut()
	{
		
		System.out.println("user has logout");
	}

}
