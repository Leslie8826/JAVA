/* 
* 
* This program implements a function to check if a linked list is a palindrome.
* 
*/

import java.util.LinkedList;

public class PalindromeChecker {
	public void PalChecker(LinkedList<Character> word){
		int count=0;
		 
		 for(int i=0; i<word.size(); i++) {
			 int j=word.size()-1-i;
			 if(word.get(i) == word.get(j)) {
				 count++;
			 }
		 }
		 
		 if(count == word.size())
			 System.out.println("\n PALINDROME");
		 else
			 System.out.println("\n NOT PALINDROME");
			 
	}
	
	public void display(LinkedList<Character> l) {
		for(int i=0; i<l.size(); i++) {
			 System.out.print(l.get(i) + " ");
		}
	}

	public static void main(String[] args) {	
		 LinkedList<Character> list1 = new LinkedList<Character>();
		 list1.add('y');
		 list1.add('a');
		 list1.add('y');
		 list1.add('y');
		 
		 LinkedList<Character> list2 = new LinkedList<Character>();
		 list2.add('y');
		 list2.add('a');
		 list2.add('y');
		 
		 PalindromeChecker pal = new PalindromeChecker();
		 pal.display(list1);
		 pal.PalChecker(list1);
		 
		 System.out.print("\n");
		 pal.display(list2);
		 pal.PalChecker(list2);
	}
}

