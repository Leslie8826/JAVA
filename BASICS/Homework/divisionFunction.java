/* This program computes a division for integers with a subtraction.
 * It uses a function and returns an integer as a result.
 * */

import java.util.Scanner;

public class divisionFunction {
	public static int division(int x, int y){
		int res = 0;
		int cour = x;
		
		while(cour >= y){
			cour=cour - y;
		    res = res + 1; 
		    }
		return res;
	}
  
	public static void main(String[] args) {
		System.out.println("Enter a dividend: ");
		Scanner input = new Scanner(System.in);
		int dividend = input.nextInt();
		
		System.out.println(" Enter a divisor: ");
		int divisor = input.nextInt();
		
		System.out.println("\n" + dividend + " / " + divisor + " = " + division(dividend, divisor));
	}

}


