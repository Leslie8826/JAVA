// This programs creates a 2D array: number of cars (columns) sold per salesperson (rows) 
// The program also asks the user to type the number of cars sold per salesperson in the array.
// Then the programs calculates the number of cars sold per salesperson a well as the total sales 
// in dollars per salesperson
// We created an array of salesperson to have access to the names of the salespersons with their ids (index of the array). 
// The ids used are the same ids as in the 2D array.
// We used the same strategy for the array of cars names. We keep the information in an array to get access of the 
// name or type of car with the id (or index).



import java.util.Scanner;

public class carSales {

	public static void main(String[] args) {
		String[] salesperson = new String[5];
		String[] car = new String[4];
		
		Scanner scan = new Scanner(System.in);
		
		// add values to the array of salespersons
		for (int i=0; i<5; i++) {
			System.out.println("Enter the " + i + "th salesperson: ");
			salesperson[i] = scan.nextLine();
		}
		
		// Displays the salesperson array
		System.out.println("\n Salespersons list and id associated: ");
		for (int i=0; i<5; i++) {
			System.out.print(i);
			System.out.print(" "  + salesperson[i]);
			System.out.print("\n");
		}
		
		// adds values typed by a user to the array of cars
		for (int i=0; i<4; i++) {
			System.out.println("\n Enter the " + i + "th car: ");
			car[i] = scan.nextLine();
		}
		
		// displays the array of cars
		System.out.println("\n Cars list and id associated: ");
		for (int i=0; i<4; i++) {
			System.out.print(i);
			System.out.print(" "  + car[i]);
			System.out.print("\n");
		}
		
		// table of numbers of cars sold per salesperson
		int[][] table = new int[5][4];
		
		Scanner scan2 = new  Scanner(System.in);
		
		// adds values to the table array
		for(int k=0; k<5; k++) {
			for (int l=0; l<4; l++) {
				System.out.println("\n Number of cars (type " + l + ") sold for salesperson " + k + ": ");
				table[k][l] = scan2.nextInt();
			}
		}
		
		// displays the array of table
		System.out.println("Number of cars sold:");
		for (int k=0; k<5; k++) {
			System.out.print("Salesperson " + k + ": ");
			for (int l=0; l<4; l++) {
				System.out.print("\t" + table[k][l]);
			}
			System.out.print("\n");
		}
		
		// Number of cars sold per category
		System.out.println("\n Number of cars sold: ");
		
		int[] nb_carsSold = new int[4];
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<5; j++) {
				nb_carsSold[i] = table[j][i] + nb_carsSold[i];
			}
		}
		
		// displays the number of cars within the array nb_carsSold
		for (int h=0; h<4; h++) {
			System.out.print(car[h] + " = " + nb_carsSold[h]);
			System.out.print("\n");
		}
		
		// Let's calculate how much a salesperson made:
		int[] carPrice = {77500, 99000, 25099, 54250};
		int[] sales = new int[5];
		
		//adds the sales values per salesperson in the array
		for(int p=0; p<5; p++) {
			for(int w=0; w<4; w++) {
				sales[p] = sales[p] + table[p][w]*carPrice[w];
			}
		}
		
		System.out.println("\n");
		// Let's display the sales per  person
		for(int q=0; q<5; q++) {
			System.out.print(salesperson[q] + ": \t" + sales[q]);
			System.out.println("\n");
		}	
	}
}
