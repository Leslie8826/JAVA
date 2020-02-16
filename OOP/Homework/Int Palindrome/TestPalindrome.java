public class TestPalindrome {
	public static void main(String[] args) {
		int nb = 12111;
		palindrome pal = new palindrome(nb);

		System.out.println("Is " + nb + " a palindrome? \n" + pal.isPalindrome(nb));
  }
}

