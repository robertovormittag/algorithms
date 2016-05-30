package net.robertovormittag.idealab.algos.strings;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.Test;

public class SimplePalindromeFinderTest {

	private static final Logger log = Logger.getLogger(SimplePalindromeFinderTest.class.getName());
	
	private static final String input3 = "bananas";

	@Test
	public void testFindLongestPalindromicSubstring() {
		
		PalindromeFinder pf = new SimplePalindromeFinder();
		String expectedPal = "anana";
		String pal = pf.findLongestPalindromicSubstring(input3);
		assertTrue(pal.equals(expectedPal));
        //log.info("Longest palindrome is " + pal);
	}

}
