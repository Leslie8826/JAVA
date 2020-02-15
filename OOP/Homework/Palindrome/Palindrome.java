public class Palindrome {
	void palindrome(String str) {
		int count = 0;
		for(int p = 0; p < str.length(); p++) {
			if(str.charAt(p) == str.charAt(str.length()-1 - p)) {
				count = count + 1;
			}
		}
		
		if (count == str.length()) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is not a palindrome.");
		}
	}
}

