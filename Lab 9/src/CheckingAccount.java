
public class CheckingAccount extends BankAccount {
	private static final double FEE = 0.15;
	
	public CheckingAccount(String name, double amount) {
		super(name,amount);
		setAccountNumber(getAccountNumber() + "-10");
	}
	
	public boolean withdraw(double amount){
		boolean completed = true;
		if (amount - FEE > 0)
			setBalance(getBalance() - amount - FEE);
		else 
			completed = false;
		return completed;
	}
	
}
