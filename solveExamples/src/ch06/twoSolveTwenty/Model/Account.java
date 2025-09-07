package ch06.twoSolveTwenty.Model;

public class Account {
	String accountNumber;
	String accountName;
	int accountBalance;

	public Account(String accountNumber, String accountName, int accountBalance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	public String getAccountNumber() { return accountNumber; }
	public String getAccountName() { return accountName; }
	public int getAccountBalance() { return accountBalance; }


}
