import java.util.Date;
import java.util.Scanner;

public class TheLinkedListTester {

	public static void main(String[] args) throws InterruptedException{
		TheLinkedList store = new TheLinkedList();

		String manager; // stores manager's name
		String input; // storess the input from the user
		int nb_cashiers; // stores the number of cashiers
		Date date = new Date(2019, 6, 25); // creates new date July 25th 2019
		Date after_date = new Date(2019, 6, 26); // creates new date July 26th 2019
		Scanner scan = new Scanner(System.in); // gets user input for nb_cashiers and manager name
		Scanner scan2 = new Scanner(System.in); // gets user input for list of names
		Scanner scan3 = new Scanner(System.in); // gets user input for cashier_index
		Scanner scan4 = new Scanner(System.in);
		char yes_no;  // character 'y' or 'n' in switch statement
		char add_remove; // character 'a' or 'r' in switch statement
		int cashier_index; // index of cashier who will be removed from list
		String cashier_name; // index of cashier who will be removed from list
		
		
		// Asks manager's name from user
		System.out.println("Hey there Manager! What is your name?");
		manager = scan.nextLine(); 
		store.addFirst(manager); // adds manager in the top of the list
				
		// Delay for 1 second
		Thread.sleep(1000);
				
		System.out.println("\n Hello Manager " + manager + ". Nice to have you here.");
		Thread.sleep(1000);
		
		// Asks number of cashiers from user
		System.out.println("\n How many cashiers work for you?");
		nb_cashiers = scan.nextInt();
		Thread.sleep(1000);
		
		System.out.println("\n Now, let's enter the list of cashiers in your store! ");
		
		// Loop to ask input from user and store the input in a linked list
		for(int i=1; i <= nb_cashiers; i++) {
			System.out.println("Enter the " + i + "th cashier:");
			input = scan2.nextLine();
			store.addLast(input); // adds cashiers at the end of the list behind the manager
		}
		
		Thread.sleep(1000);
		System.out.println("\n Below is you and the list of the cashiers in your store on " + date +":");
		
		// Displays list of cashiers with the head of the list being the store manager
		store.display();
		
		
        Thread.sleep(1000);
		
		//The day after, the manager can decide to update the list of cashiers
		System.out.println("\n Hello Manager " + manager + "! Today is " + after_date);
		Thread.sleep(600);
		System.out.println("\n Do you want to update your list of cashiers today?");
		yes_no = scan3.next().charAt(0);
		
		switch (yes_no) {
			case 'y':
				System.out.println(" Add (a) or remove (r)? ");
				add_remove = scan3.next().charAt(0);
				switch(add_remove) {
					case('a'):
						System.out.println("Manager " + manager + ", Please enter the name of the new the cashier:");
						input = scan2.nextLine();
						store.addLast(input);
						break;
					
					case('r'):
						System.out.println("Please Manager " + manager + ", type cashier's name?");
					    input = scan2.nextLine();
					    System.out.println("you typed: " + input);
					    //store.addLast(input); /*test with addLast method works*/
					    store.delete(input); /**does not work**/
					    break;
				}
				break;
						
			case 'n':
				System.out.println("\n Understood Manager, " + manager + "! No change in your list today!");
				break;
		}
		
		System.out.println("\n Below are the list of the cashiers in your store on " + after_date +":");
		store.display();
	}
			
		
}

