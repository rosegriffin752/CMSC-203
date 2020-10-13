
public class SavingsAccount extends BankAccount {
	private double rate = 2.5;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber++;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		accountNumber = super.getAccountNumber() + "-" + ++savingsNumber;

	}
	
	public void postInterest() {
		setBalance(getBalance() + (getBalance() * (rate/100) * (1.0/12)));
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
}
