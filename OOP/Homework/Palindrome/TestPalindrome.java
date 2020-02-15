import java.util.Scanner;

public class TestPalindrome {
	public static void main(String[] args) {
		String s;
		Palindrome pal = new Palindrome();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a word: ");
		s = scan.nextLine();
		
		pal.palindrome(s);
	}
}

