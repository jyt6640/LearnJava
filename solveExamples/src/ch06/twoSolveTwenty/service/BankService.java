package ch06.twoSolveTwenty.service;

import ch06.twoSolveTwenty.Model.Account;

import java.util.ArrayList;
import java.util.List;

public class BankService {
	private final List<Account> accounts = new ArrayList<>();

	public boolean addAccount(String accountNumber, String accountName, int accountBalance) {
		Account account = new Account(accountNumber, accountName, accountBalance);
		if (accounts.contains(account)){
			return false;
		} else {
			accounts.add(account);
			return true;
		}
	}

	public List<Account> getAllAccount() {
		return accounts;
	}

	public Account depositService(String accountNumber, int amount) {
		for (Account a : accounts) {
			if (a.getAccountNumber().equals(accountNumber)) {
				a.depositBalance(amount);
				return a;
			}
		}
		return null;
	}



	public boolean searchService(String accountNumber) {
		for(Account a : accounts){
			if(a.getAccountNumber().equals(accountNumber)){
				return true;
			}
		}
		return false;
	}
}
