package testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyTestCase
{
	@Before
	public void before()
	{
	    System.out.println("Before");
	}
	@Test
	
	public void testcase1()
	{
	    System.out.println("Testcase1");
	}
	
	@After
	public void after()
	{
	    System.out.println("After");
	}
	
	

}
