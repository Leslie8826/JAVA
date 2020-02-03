// This class represents the bank account object with the instance
// variables: balance (of the account), account_holder (name of the bank account holder) 
// as well as the account_number. 
// This class also has 2 methods to display the balance of the account and 
// to add money in the account. The latter will return the current balance of the account.
// 

public class account {
	int balance;
	String account_holder; 
	int account_number;
	
	void display_balance(){
		System.out.println("balance = "+ this.balance); 
	}
	
	int deposit(int amount){
		this.balance = this.balance +  amount;
		return this.balance; 
	}
}

