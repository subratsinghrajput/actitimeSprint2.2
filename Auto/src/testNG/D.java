package testNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;



public class D {
@Test
public void a()
{
	Assert.fail();
System.out.println("Hi");	
}
@Test(dependsOnMethods = "a")
public void b()
{
System.out.println("will u go a date");	
}
@Test(dependsOnMethods = "b")
public void c()
{
System.out.println("Bye");	
}

}
