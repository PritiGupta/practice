import static org.junit.Assert.*;

import org.junit.Test;

public class solutiontest {

	@Test
	public void testfor2() {
	assertEquals("NotWeird",Solution1.getSolution(2));

		}
	@Test
	public void testfor3() {
	assertEquals("Weird", Solution1.getSolution(3));
	
	}
	@Test
	public void testfor4() {
	assertEquals("NotWeird", Solution1.getSolution(4));
	
	}
	@Test
	public void testfor5() {
	assertEquals("Weird", Solution1.getSolution(5));
	
	}
	@Test
	public void testfor6() {
	assertEquals("Weird", Solution1.getSolution(6));
	
}
	@Test
	public void testfor7() {
	assertEquals("Weird", Solution1.getSolution(7));
	
	}
	@Test
	public void testfor20() {
	assertEquals("Weird", Solution1.getSolution(20));
	
	}
	
	@Test
	public void testfor24() {
	assertEquals("notweird", Solution1.getSolution(24));
	
	}
	
	
}
