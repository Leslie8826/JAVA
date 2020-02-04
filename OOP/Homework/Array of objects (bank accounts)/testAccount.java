
public class testAccount {
	public static void main(String[] args) {
		// Creates an array of Account
		Account[] acc = new Account[10];
		
		// Creates the Accounts and assigns each element of 
		// the array to a each Account created
		for (int i=0; i<10; i++) {
			acc[i]= new Account();
		}
		
		// Test to check the default values of the balance
		for (int i=0; i<10; i++) {
			System.out.println("Account " + i + ": ");
			acc[i].display();
			System.out.println("\n");
		}
		
		// ($200 + $1,000*i) deposit on each Account where i is the index of the array
		for (int i=0; i<10; i++) {
			acc[i].deposit(200 + 1000*i);
		}
		
		System.out.println("After depositing $200+$1,000*i: ");
		// Test to check the default values of the balance
		for (int i=0; i<10; i++) {
			System.out.print("Account " + i + " --> ");
			acc[i].display();
			System.out.print("\n");
		}
		
		int count=0;
		// Transfer $20 to account that follow the account at index i
		for (int i=0; i<10; i++) {
			count = i;
			while(count<9) {
				acc[i].transfer(20, acc[count+1]);
				count = count + 1;
			}
		}
		
		System.out.println("Transfer $20 to account that follow the account at index i: ");
		for (int i=0; i<10; i++) {
			System.out.print("Account " + i + " --> ");
			acc[i].display();
			System.out.print("\n");
		}
	}

}

