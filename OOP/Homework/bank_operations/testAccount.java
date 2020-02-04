
public class testAccount {

	public static void main(String[] args) {
		Account a1 = new Account();
		Account a2 = new Account();
		
		// $500 deposit on account 1
		a1.deposit(500);
		
		// $1,000 deposit on account 2
		a2.deposit(1000);
		
		// $10 withdrawal on account 2
		a2.withdraw(10);
		
		// $75 transfer from account 1 to account 2
		a1.transfer(75, a2);
		
		// Display balances on 2 accounts
		System.out.println("Account 1:");
		a1.display();
		System.out.println("Account 1:");
		a2.display();
	}

}

