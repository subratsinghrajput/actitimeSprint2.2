package testNG;

import org.testng.annotations.Test;

public class F {

	@Test(groups="smoke",priority=1)
	public void signUp()
	{
	System.out.println("User has signedUp");	
		
	}
	
	@Test(groups="smoke",priority=2)
	public void signIn()
	{
		
		System.out.println("User has signedIn");	
	}
	@Test(groups="compose",priority=3)
	public void compose()
	{
		
		System.out.println("User has composed");
	}
}
