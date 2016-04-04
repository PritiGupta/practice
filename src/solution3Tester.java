import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Priti
 *
 */
public class solution3Tester {
	@Test
	public  void isString(){
		assertEquals("String:hello",solution3.objTest("hello"));
		
	}
	@Test
	public  void isInt(){
		assertEquals("Int:2",solution3.objTest(2));
		
	}
	@Test
	public  void isDouble(){
		assertEquals("Double:1.0",solution3.objTest(1.00));
		
	}
	
}
