/* This program checks is a number is prime or not */

import java.util.Scanner;

public class primeNumberChecker {
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		
		int nb = scan.nextInt();
		int check = 0;
		
		int count = 0;
		
		if(nb == 0 || nb == 1) {
			System.out.println(nb + " is not a prime number");
		} else {
			for (int i=2; i<nb; i++) {
				check = nb%i;
				System.out.println(nb + " % " + i + " = " + check);
				
				if (check == 0) {
					count = count + 1; // counts number of times nb%i==0 exists
				} 
				
				else {
					count = count + 0;
					}
				
				}
			if (count == 0) { // if count == 0, nb%i was never equal to zero
				System.out.println("\n count = " + count + ". Hence, " + nb + " is a not prime number");
			}
			else {
				System.out.println("\n count = " + count + ". Hence, " + nb + " is a prime number");
			}
		}
	}

}

