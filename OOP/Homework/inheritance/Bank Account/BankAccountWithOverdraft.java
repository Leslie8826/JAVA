public class BankAccountWithOverdraft extends BankAccount{
	double maxOverdraft ;
	
	public void setMaxOverdraft(double amount){ 
		this.maxOverdraft = amount ;
	}
	
	public BankAccountWithOverdraft (String holder, char[] num, double amount, double maxOverdraft){ 
		super(holder, num, amount);
		this.maxOverdraft = maxOverdraft; 
	}
	
	public void withdraw(double amount){
		if (this.balance - amount < (- maxOverdraft)){
			throw new InsufficientBalanceError(); 
			} else {
				balance = balance - amount; 
			}
		}
}
	

