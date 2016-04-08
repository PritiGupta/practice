import static org.junit.Assert.*;

import org.junit.Test;

public class wordWrapkataTest {
//
//	@Test
//	public void testWrap() {
//		fail("Not yet implemented");
//	}
	
	@Test
    public void testWrap1() throws Exception {
      assert(wordWrapkata.wrap("", 1).equals(""));
    }
	 @Test
	    public void stringShorterThanColDoesNotWrap() throws Exception {
	      assert(wordWrapkata.wrap("word", 10).equals("word"));
	    }
	
	 @Test
	    public void stringgreatertehancoldoeswrap() throws Exception {
	      assert(wordWrapkata.wrap("wordforthiskata", 10).equals("word"));
	    }
	 @Test
	    public void splitOneWord() throws Exception {
	      assert(wordWrapkata.wrap("word", 2).equals("wo\nrd"));
	    }
	 @Test
	    public void splitmorethanoneWord() throws Exception {
	      assert(wordWrapkata.wrap("wordword toworst", 4).equals("word\nword\n towo\nrst"));
	    }
	
	 @Test
	    public void splitOneWordManyTimes() throws Exception {
	      assert(wordWrapkata.wrap("abcdefghij", 3).equals("abc\ndef\nghi\nj"));
	      
	    }
	 @Test
	    public void wrapOnWordBoundary() throws Exception {
	      assert(wordWrapkata.wrap("word word", 5).equals("word\nword"));      
	    }
	 @Test
	    public void wrapWordAfterBoundary() throws Exception {
	      assert(wordWrapkata.wrap("word word", 6).equals("word\nword"));      
	    }
	 @Test
	    public void wrapWellBeforeWordBoundary() throws Exception {
	      assert(wordWrapkata.wrap("word word", 3).equals("wor\nd\nwor\nd"));
	    }
	 @Test
	    public void wrapJustBeforeWordBoundary() throws Exception {
	      assert(wordWrapkata.wrap("word word", 4).equals("word\nword"));
	    }
}
