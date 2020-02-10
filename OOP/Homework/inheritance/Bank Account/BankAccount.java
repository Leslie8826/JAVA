public class BankAccount {
	String nameAccountHolder ; 
	char[] number ;
	double balance ;
	
	public BankAccount(){	
	}
	
	public BankAccount(String holder, char[] num, double amount){ 
		this.nameAccountHolder = holder ;
	    this.number = num ;
	    this.balance = amount ;
	}
	
	public double getCurrentBalance (){ 
		return this.balance ;
	}
	
	public void deposit(double amount){ 
		this.balance = balance + amount ;
	}
	
	public void withdraw(double amount){
		System.out.println("Withdrwal on bank account"); 
		if (this.balance < amount){
			throw new InsufficientBalanceError() ; 
		} else {
		    balance = balance - amount ; 
		    }
		}
	
	public void transfer(BankAccount c, double amount){
		c.withdraw(amount);
	    this.deposit(amount);
	}
}

