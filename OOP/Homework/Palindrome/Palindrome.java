public class Palindrome {
	void palindrome(String str) {
		int count = 0;
		for(int p = 0; p < str.length(); p++) {
			// compares the letters read from left to right to the letters read from right to left
			if(str.charAt(p) == str.charAt(str.length()-1 - p)) {
				// counts the number of letters that are similar
				count = count + 1;
			}
		}
		
		/* if the number of letters read from left to right are similar to the letters read from right to left
		we have a palindrome */
		if (count == str.length()) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is not a palindrome.");
		}
	}
}

