/* This program asks a user to enter an amount of money in euro currency. 
   Then the program converts it into dollars. */

import java.util.Scanner;

public class currencyConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Enter a number to convert: ");
		double money = scanner.nextDouble();
		double eurDol = 1.12 * money; // $1 = 1.12 euros on Jan 15th 2020
		
		System.out.println(money + " euro(s) = " + eurDol + " dollars");
				
	}

}
