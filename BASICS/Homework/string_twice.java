/* This program asks the user to enter string input. Then, it outputs the string twice in a row: 
   all uppercase first and all lowercase second */

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Stack;

public class string2 {

	public static void main(String[] args) {
		Stack<String> sta = new Stack<String>();
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter a String: ");
		String str = input.nextLine();
		
		sta.push(str.toUpperCase());
		sta.push(str.toLowerCase());
			
		// Display elements of stack
		System.out.println("\n \n Display 2:");
		while (!sta.isEmpty()){
			String temp = sta.pop();
			System.out.print(temp);
			
		}
	}

}
