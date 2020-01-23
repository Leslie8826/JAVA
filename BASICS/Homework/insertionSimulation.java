/* FINAL VERSION 
 *
 * This programs creates an array of characters of size 4 then asks the user to enter 
 * the number of characters they want to add. The program also asks the user to choose
 * the index he wants to insert the new characters.
 * Since, arrays are fixed, in the program, we create a second array where will have 
 * the values of the 1st array and the characters inserted at the chosen index
 * 
 * */

import java.util.Scanner;

public class array7_v4 {

	public static void main(String[] args) {
		int n = 4;
		char[] ch = new char[n];
		ch[0] = 'x';
		ch[1] = 'r';
		ch[2] = 'l';
		ch[3] = 'b';
		
		System.out.println("The array is: ");
		for (int i=0; i<ch.length; i++) {
			System.out.print(" " + ch[i] + " ");
		}
		
		System.out.print("\n");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Enter the number of characters you want to insert: ");
		int nb_char  = scan.nextInt();
		
		char[] ch2 = new char[n + nb_char];
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("\n Indice you want to insert the characters?: ");
		int indice_char = scan2.nextInt();
		
		int count = 0;
		char charr = 'c';
		
		Scanner scan3 = new Scanner(System.in);
		for (int p = 0; p < nb_char + n; p = p + 1) {
			if(p < indice_char ) {
				ch2[p] = ch[p];
			} else {
				if(p >= indice_char && p < indice_char + nb_char) {
					while (count < nb_char) {
						System.out.println("Enter a character: ");
					    charr = scan3.next().charAt(0);
					    ch2[p+count] = charr;
					    count = count + 1;
					}
				}
				if (p >= indice_char+nb_char && p <= nb_char+n) {
					ch2[p] = ch[p-nb_char];
					}
			}
		}
		
		System.out.println("\n The new array is: ");
		for (int l=0; l < n+nb_char; l++) {
			System.out.print(" " + ch2[l] + " ");
		}
		
	}
}
