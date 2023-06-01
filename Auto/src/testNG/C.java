package testNG;

import org.testng.annotations.Test;

public class C {
@Test(invocationCount=2)
public void a()
{
System.out.println("oh");	
}

@Test
public void b()
{
System.out.println("jaane");	
}
@Test
public void c()
{
System.out.println("jana");	
}


}
