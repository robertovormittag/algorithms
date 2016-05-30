package net.robertovormittag.idealab.algos.strings;

public class SimplePalindromeFinder implements PalindromeFinder {

	@Override
	public String findLongestPalindromicSubstring(String input) {
		
		int rightIndex = 0, leftIndex = 0;
		String currentPalindrome = "", longestPalindrome = "";
		
		for (int centerIndex = 1; centerIndex < input.length() - 1; centerIndex++) {
			
			leftIndex = centerIndex - 1;
			rightIndex = centerIndex + 1;
			
			while (leftIndex >= 0 && rightIndex < input.length()) {
				
				if (input.charAt(leftIndex) != input.charAt(rightIndex)) {
					break;
				}
				currentPalindrome = input.substring(leftIndex, rightIndex + 1);
				longestPalindrome = currentPalindrome.length() > longestPalindrome.length() ? currentPalindrome
						: longestPalindrome;
				leftIndex--;
				rightIndex++;
			}
		}
		return longestPalindrome;
	}
}
