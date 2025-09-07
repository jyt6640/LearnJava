package ch06.twoSolveTwenty.controller;

import ch06.twoSolveTwenty.Model.Account;
import ch06.twoSolveTwenty.service.BankService;
import ch06.twoSolveTwenty.view.InputView;
import ch06.twoSolveTwenty.view.OutputView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankController {
	OutputView outputView;
	InputView inputView;
	Scanner sc = new Scanner(System.in);
	BankService bs = new BankService();

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
					deposit();
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


		boolean add = bs.addAccount(accountNum, ownerName, balance);
		if (add) {
			outputView.showMessage("계좌가 성공적으로 생성되었습니다.");
		} else {
			outputView.showMessage("이미 존재하는 계좌입니다.");
		}
	}

	public void showAllAccount() {
		for (Account acc : bs.getAllAccount()) {
			outputView.showMessage(acc.toString());
		}
		if(bs.getAllAccount().isEmpty()) {
			outputView.showMessage("계좌가 존재하지 않습니다.");
		}
	}

	public void deposit() {
		String accountNumber = inputView.accountNumber();
		int amount = inputView.depositAmount();

		if(bs.searchService(accountNumber)) {
			bs.depositService(accountNumber, amount);
			outputView.showMessage("입금이 성공적으로 완료되었습니다.");
		} else {
			outputView.showMessage("존재하지 않는 계좌번호입니다.");
		}

	}
}

