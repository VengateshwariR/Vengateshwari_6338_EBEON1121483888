package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class Addtest {

	@Test
	public void Addtest() {
		MyJunitClass junit = new MyJunitClass();
		int result = junit.add(10, 20);
		assertEquals(30,result);
		
	}

}
