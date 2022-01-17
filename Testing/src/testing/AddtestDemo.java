package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AddtestDemo
{

	@Test
	public void Addtest() {
		MyJunitClass junit = new MyJunitClass();
		int result = junit.add(10, 20);
		assertEquals(30,result);
		System.out.println("@test");	
	}
	
	
	@Before
	public void subtest() {
		MyJunitClass junit = new MyJunitClass();
		int result = junit.sub(20,10 );
		assertEquals(10,result);
		System.out.println("@Before");	
	}
		

		
		

}
