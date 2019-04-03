package entities;

public class Conta {
	private int acountNumber;
	private String accountHolder;
	private double balance;
	
	public Conta(int acountNumber, String accountHolder, double balance) {
		super();
		this.acountNumber = acountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public Conta(int acountNumber, String accountHolder) {
		super();
		this.acountNumber = acountNumber;
		this.accountHolder = accountHolder;
	}

	public int getAcountNumber() {
		return acountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void Deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "account "
				+ acountNumber
				+ ", holder: "
				+ accountHolder
				+ ", balance: $"
				+ String.format("%.2f", balance);
	}
	
}


