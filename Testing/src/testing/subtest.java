package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class subtest {

	@Test
	public void subtest() {
		MyJunitClass junit = new MyJunitClass();
		int result = junit.sub(20,10 );
		assertEquals(10,result);
		

	}

}
