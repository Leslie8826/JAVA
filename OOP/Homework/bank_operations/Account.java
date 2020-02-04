
public class Account {
	int balance = 0;
	
	void deposit(int amount) {
		balance = balance + amount;
	}
	
	void withdraw(int amount) {
		balance = balance - amount;
	}
	
	void transfer(int amount, Account destination) {
		this.withdraw(amount);
		destination.deposit(amount);
	}
	
	void display() {
		System.out.println("balance: " + balance);
	}
}

