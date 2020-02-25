import java.util.Scanner;
import java.util.Date;
import java.util.*;
import java.util.Stack;

public class Stack_1 {
	public static void main(String[] args) throws InterruptedException {
		String manager; // stores manager's name
		String input; // stores the input from the user
		Date date = new Date(2019, 6, 25); // creates new date July 25th 2019
		Stack<String> list = new Stack<String>(); // list to store the cashiers' names
		Scanner scan = new Scanner(System.in); // gets user input for nb_cashiers and manager name
		Scanner scan2 = new Scanner(System.in); // gets user input for list of names
		int nb_cashiers; // stores the number of cashiers
		char yes_no;  // character 'y' or 'n' in switch statement
		Scanner scan3 = new Scanner(System.in); // gets user input for cashier_index
		Date after_date = new Date(2019, 6, 26); // creates new date July 26th 2019
		char add_remove; // character 'a' or 'r' in switch statement
		
		
		// Checks if stack is empty
		System.out.println("\n Is stack empty? " + list.empty());
		Thread.sleep(1000);
		
		// Asks manager's name from user
		System.out.println("\n Hey there Manager! What is your name?");
		manager = scan.nextLine(); 
		
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
			list.push(input);
		}
		
		Thread.sleep(1000);
		System.out.println("\n Below is the list of the cashiers in your store on " + date +":");
		
		// Loop to check the list of names
		for(int i=0; i<list.size(); i++) {
			System.out.println("Cashier " + (i+1) +": "+ list.get(i));
			Thread.sleep(600);
		}
		
		// Element at top of stack
		System.out.println("\n Element at top of stack (last added cashier): " + list.peek());
		
		// Checks if stack is empty
		System.out.println("\n Is stack empty? " + list.empty());
		
        Thread.sleep(1000);
		
		//The day after, cashier number 4 quits (in the case of number of cashiers = 5)
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
					list.push(input);
					break;
				
				case('r'):
					System.out.println("Manager " + manager + ", now removing last cashier added: " + list.peek());
				    list.pop();
				    break;
			}
			break;
					
		case 'n':
			System.out.println("\n Understood Manager, " + manager + "! No change in your list today!");
			break;
	}
	
	System.out.println("\n Below are the list of the cashiers in your store on " + after_date +":");
	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i));
		Thread.sleep(600);
		}
	}

}

