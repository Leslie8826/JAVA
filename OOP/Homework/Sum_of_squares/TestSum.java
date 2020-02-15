/* This program computes the sum of squares of 
 * the numbers from 1 to 9 
 * */

import java.util.Scanner;

public class testSum {
	public static void main(String[] args) {
		int n=10;
		int[] nb = new int[n];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number between 1 and 9: ");
		
		while(n<1 || n>9) {
				System.out.println(" Type another number:");
				n = scan.nextInt();
		}
		
		// Stores values in the array
		for (int y=0; y<n; y++) {
			nb[y] = y+1;
		}
		
		// Displays the array
		System.out.println(" The array is:");
		for (int y=0; y<n; y++) {
			System.out.print(nb[y] + " ");
		}
		
		System.out.println("\n ");
		Sum sum = new Sum();
		System.out.println(" Sum of squares: \n Sum = " + sum.sum(nb));
		
	}

}

