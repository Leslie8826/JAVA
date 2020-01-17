/* This programs takes a price as input and returns the total to be paid 
   (original price + tax) according to the tax typed. If the tax entered by the user 
   is not known by our system, the program will keep asking to enter a tax until it is 
   known by our system. */

import java.util.Scanner;

public class priceCalculator {
	public static void main(String[] args) {
		boolean answer = false;
		double tax1 = 0.196;
		double tax2 = 0.05;
		
		System.out.println("Enter the price of your product: ");
		Scanner scan1 = new Scanner(System.in);
		double price = scan1.nextDouble();
				
		while (answer == false) {
			System.out.println("Type a tax rate: ");
			Scanner scan = new Scanner(System.in);
			double tax = scan.nextDouble();
			
			if (tax == 0.196 || tax == 0.055) {
				System.out.println("You pay: " + (price + price*tax));
				answer = true;
			} else {
				System.out.println("We do not know this tax. Therefore, we "
						+ "cannot give you the whole price");
				answer = false;
			}
			
		}
	}

}
