/* This program rotates an array of n elements to the right by k steps.
   Example: when n=7 and k=3, the array [1, 2, 3, 4, 5, 6, 7] rotates to
   [5, 6, 7, 1, 2, 3, 4]
*/

import java.util.Scanner;

public class rotate {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		int[] array2 = new int[7];
		int k;
		int count;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Type a number: ");
		k = s.nextInt();
		
		while(k < 0 || k>=7) {
			System.out.println("Type a number between 0 and 7: ");
			k = s.nextInt();
		}
		
		count = 0;
		
    
		for(int i = 0; i < array2.length-k-1; i++) {
			array2[i] = array[k+1+i];
			if(i == array2.length-k-2) {
				for(int l = array2.length - k-1; l < array2.length; l++) {
					array2[l] = array[count];
					count++;
				}
			}
		}
		
	// Prints the new arrays to check the results
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}	
	}
}


// OUTPUT
Type the value of k: 
3
  
Original array:
 1 2 3 4 5 6 7

Rotated array:
 5 6 7 1 2 3 4
   
   
   
 // OUTPUT 2
Type the value of k: 
1

 Original array:
 1 2 3 4 5 6 7

Rotated array:
 3 4 5 6 7 1 2
   

// OUTPUT 3
Type the value of k: 
5

Original array:
1 2 3 4 5 6 7

Rotated array:
7 1 2 3 4 5 6
