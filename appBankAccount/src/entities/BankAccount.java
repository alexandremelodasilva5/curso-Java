package entities;

public class BankAccount {
	private int accountNumber;
	private String name;
	private double value;
	private final int FEE = 5;
	
	public BankAccount() {
		super();
	}

	public BankAccount(int accountNumber, String name) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public BankAccount(int accountNumber, String name, double depositValue) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		depositValue(depositValue);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getValue() {
		return value;
	}
	
	public void depositValue(double value) {
		this.value += value;
	}
	
	public void withdrawValue(double value) {
		this.value -= value + FEE;
	}
	
	public String toString() {
		return "Account "+
				accountNumber+
				", Holder: "+
				name+
				", Balance: $ "+
				String.format("%.2f", value);
				
	}
	
}
