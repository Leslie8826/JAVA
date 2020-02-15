/*This program computes the sum of positive values in an array
 * We create a class Sum in which we create a sum function
 * */

import java.util.Scanner;

public class TestSum {
	public static void main(String[] args) {
		int n = 200;
		int[] nb = new int[n];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		n = scan.nextInt();
		System.out.print("\n");
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter a value: ");
			nb[i] = scan.nextInt();
		}                  
		
		Sum sum = new Sum();
		System.out.println("\n");
		System.out.println("Sum of positive values: " + sum.sum(nb));
	}
}

