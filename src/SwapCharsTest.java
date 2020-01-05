import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwapCharsTest {

	@Test
	void swapsStringsWith2Chars() {
		assertEquals("AB",SwapChars.swap2("BA"));  // didn't make SwapChars2 yet --> fail -> makes a new method
		
		
	} // close 2 char test
	
	@Test
	void swapsStringsWith6Chars() {
		assertEquals("fe",SwapChars.swap2("abcdef"));  
		
	} // close 6 char test
	
	@Test
	void swapsStringsWith1Chars() {
		assertEquals("1",SwapChars.swap2("1"));  
		
	} //close 1 char test
	
	@Test
	void swapsEmptyString() {
		assertEquals("",SwapChars.swap2(""));  
		
	} //close empty test
	
	
} //class
