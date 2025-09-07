package ch06.twoSolveTwenty.controller;

import ch06.twoSolveTwenty.Model.Account;
import ch06.twoSolveTwenty.view.InputView;
import ch06.twoSolveTwenty.view.OutputView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankController {
	OutputView outputView;
	InputView inputView;
	Scanner sc = new Scanner(System.in);
	List<Account> account = new ArrayList<>();

	public BankController(OutputView outputView, InputView inputView) {
		this.outputView = outputView;
		this.inputView = inputView;
	}

	public void run() {
		while(true) {
			outputView.displayMenu();
			int selectMenu = sc.nextInt();
			switch (selectMenu) {
				case 1:
					outputView.showMessage("계좌생성을 선택하였습니다.");
					createAccount();
					break;
				case 2:
					outputView.showMessage("계좌목록을 선택하였습니다.");
					showAllAccount();
					break;
				case 3:
					outputView.showMessage("예금을 선택하였습니다.");
					break;
				case 4:
					outputView.showMessage("출금을 선택하였습니다.");
					break;
				case 5:
					outputView.showMessage("종료를 선택하였습니다.");
					return;
				default:
					outputView.showMessage("잘못된 입력입니다. 다시 시도해주세요.");
			}
		}
	}

	public void createAccount() {
		String accountNum = inputView.createAccountNumber();
		String ownerName = inputView.createAccountName();
		int balance = inputView.createAccountBalance();
		account.add(new Account(accountNum, ownerName, balance));
		outputView.showMessage("계좌가 생성되었습니다.");
	}

	public void showAllAccount() {
		for (Account acc : account) {
			if (acc != null) {
				outputView.showMessage("계좌번호: " + acc.getAccountNumber() + " | 계좌주: " + acc.getAccountName() + " | 계좌액: " + acc.getAccountBalance() + "원" + "\n");
			}
		}
	}
}
