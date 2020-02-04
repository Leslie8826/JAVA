
public class Account {
	double balance = 0;
	
	double deposit(double amount) {
		 balance = balance + amount;
		 return balance;
	}
	
	double withdraw(int amount) {
		return balance = balance - amount;
	}
	
	void transfer(int amount, Account destination) {
		this.withdraw(amount);
		destination.deposit(amount);
	}
	
	void display() {
		System.out.println("balance: " + balance);
	}
}

