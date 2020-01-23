import java.util.Scanner;

public class array7_v2 {

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
		
		Scanner scan3 = new Scanner(System.in);
		for (int p = 0; p < nb_char + n; p = p + 1) {
			if(p < indice_char ) {
				ch2[p] = ch[p];
			//} else if(p >= indice_char && p <= nb_char) {
			} else if(p >= indice_char) {
					System.out.println("Enter a character: ");
					ch2[p] = scan3.next().charAt(0);;
				} else if (p >= indice_char+nb_char && p < nb_char+n) {
					ch2[p] = ch[p-nb_char];
					}
			}
		
		System.out.println("\n The new array is: ");
		for (int l=0; l < n+nb_char; l++) {
			System.out.print(" " + ch2[l] + " ");
		}
		
	}
	

}
