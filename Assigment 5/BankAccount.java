
public class BankAccount extends NegativeBalanceException {
	private double balance = 0;

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BankAccount(double balance) throws NegativeBalanceException {
		super();
		this.balance = balance;
		
		if (balance >=0)
			balance = getBalance();
		else
			throw new NegativeBalanceException();
		
		
	}
	public void deposit(double amount){
		balance += amount;
	}
	public void withdraw(double amount){
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
