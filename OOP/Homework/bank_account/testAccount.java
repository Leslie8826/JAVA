// This class creates an account object and tests its methods and instance variables

public class runAccount {
	public static void main(String[] args) {
		account acc1 = new account();
		System.out.println("Balance on account: " + acc1.balance);
		
		acc1.account_number = 71253695;
		
		System.out.println("\n Balance for account number " + acc1.account_number  + ": ");
		acc1.display_balance();
		
		int deposit1 = acc1.deposit(2500);
		System.out.println("\n Balance for account number " + acc1.account_number + " after deposit of $" + deposit1 + ": ");
		acc1.display_balance();
		
		int deposit2 = (acc1.deposit(2500) - deposit1 );
		System.out.println("\n Balance for account number " + acc1.account_number + " after deposit of $" + deposit2 + ": ");
		
		int deposit3 = acc1.deposit(7500) - deposit2;
		System.out.println("\n Balance for account number " + acc1.account_number + " after deposit of $" + deposit3 + ": ");
		
		
	}

}

