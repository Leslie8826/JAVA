import java.util.Scanner;
import java.util.LinkedList;

public class LinkedList_1 {
	public static void main(String[] args) throws InterruptedException {
		String manager;
		String input;
		int nb_cashiers;
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		LinkedList<String> list = new LinkedList<String>();
		
		System.out.println("Hey there! What is your name?");
		manager = scan.nextLine();
		
		Thread.sleep(1000);
		
		System.out.println("Hello " + manager + ". Nice to have you here.");
		Thread.sleep(1000);
		System.out.println(" How many cashiers work for you?");
		nb_cashiers = scan.nextInt();
		Thread.sleep(1000);
		System.out.println("\n Now, let's enter the list of cashiers in your store! ");
		
		for(int i=1; i <= nb_cashiers; i++) {
			System.out.println("Enter the " + i + "th cashier:");
			input = scan2.nextLine();
			list.add(input);
		}
		
		Thread.sleep(1000);
		System.out.println("\n Below are the list of the cashiers in your store:");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			Thread.sleep(600);
		}
	}
}

