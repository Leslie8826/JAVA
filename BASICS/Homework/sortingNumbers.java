/* This program sorts 3 numbers entered by the user in a descending order */

import java.util.Scanner;

public class sortingNumbers {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		
		System.out.println("Enter a 1st number: ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		System.out.println("Enter a 2d number: ");
		b = scan.nextInt();
		
		System.out.println("Enter a 3rd number: ");
		c = scan.nextInt();
	
		
// Sorted numbers in descending order
	if (a < b) {
		if (a < c) {
			if (b < c) {
				System.out.println("ordered numbers: " + c + " " + b + " " + a);
			} else { // a<b, a<c, b>c
				System.out.println("ordered numbers: " + b + " " + c + " " + a);
			}
		} else {//a<b, a > c
			System.out.println("ordered numbers: " + b + " " + a + " " + c);
		}
	} else { // a > b
		if (a < c) {
		System.out.println("ordered numbers: " + c + " " + a + " " + b);
	} else { // a>b, a>c
		if (b>c) {
			System.out.println("ordered numbers: " + a + " " + b + " " + c);
		} else {
			System.out.println("ordered numbers: " + a + " " + c + " " + b);
		}
	}
	}
	
	
}
}
