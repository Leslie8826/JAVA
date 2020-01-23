/* This program creates an array. Then it asks the user to enter 2 indexes.
    The program switch the 2 values and displays the new array */


import java.util.Scanner;

public class switchValues {
	public static void main(String[] args) {
		
		int[] array = {5, 12, 14, 6, 9};
		int[] index = new int[2];
				
		for (int l=0; l<index.length; l++) {
			System.out.println("\n Enter a number between 0 and 4: ");
			Scanner scan = new Scanner(System.in);
			index[l] = scan.nextInt();
			
			while (index[l]<0 || index[l]>array.length-1) {
				System.out.println("Careful!! You have to type a number between 0 and 4");
				index[l] = scan.nextInt();
			}
		}
		
		int temp;
		
		System.out.println("\n Array before: ");
		for (int i=0; i<array.length; i++) {
			System.out.print(" " + array[i] + " ");
		}
		
		temp = array[index[0]];
		array[index[0]] = array[index[1]];
		array[index[1]] = temp;
		
		System.out.println("\n Array after: ");
		
		for (int j=0; j<array.length; j++) {
			System.out.print(" " + array[j] + " ");
		}
	}

}

