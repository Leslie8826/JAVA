// This program converts an integer to a binary number

import java.util.Stack;
import java.util.Scanner;

public class IntToBin {
	
	public void IntToBinary(int d) {
		Stack<Integer> s = new Stack<Integer>();
		int res=d;
		
		while(res > 0) {
			s.add(res%2);
			res = res/2;
		}
		
		System.out.print(d + " --> Integer to binary --> ");
		
		for(int i = s.size()-1; i >= 0 ; i--) {
			System.out.print(s.get(i) + " ");
		}
	}

	public static void main(String[] args) {
		int d; 
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter a number: ");
		d = scan.nextInt();
	
		IntToBin test = new IntToBin();
		test.IntToBinary(d);
	}
}
