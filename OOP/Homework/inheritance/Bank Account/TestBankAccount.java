public class TestBankAccount {
	public static void main(String[] args) {
		// BankAccount test
		BankAccount c1;
		BankAccount c2;
		BankAccount c3;
		
		System.out.println(" BASIC BANK ACCOUNT TEST: ");
		
		String num1 = "123456789";
		String num2 = "145775544";
		String num3 = "A4545AA54";
		
		c1 = new BankAccount("Paul", num1.toCharArray(), 1000.00); 
		c2 = new BankAccount("Paul", num2.toCharArray(), 2300.00); 
		c3 = new BankAccount("Henri", num3.toCharArray(), 5000.00);
		c1.deposit(100.00);
		c2.transfer(c1, 1000.00);
		
		System.out.println(c2.getCurrentBalance());

		
		// BankAccountWithOverdraft test
		System.out.println("\n BANK ACCOUNT WITH OVERDRAFT OPTION: ");
		BankAccountWithOverdraft d1; 
		String num4 = "DD545AA54";
		
		d1 = new BankAccountWithOverdraft("James", num4.toCharArray(), 60000.00, 10000.00);
		
		d1.withdraw(7000.00); 
		System.out.println("withdrawal OK ;" + " new balance = " + d1.getCurrentBalance());
		
		d1.setMaxOverdraft(2000.00);
		d1.withdraw(7000.00);
		
		System.out.println("withdrawal OK ;" + " new balance = " + d1.getCurrentBalance()); 
		d1.deposit(5000.00);
	}

}

