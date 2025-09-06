package ch06.twoSolveTwenty.controller;

import ch06.twoSolveTwenty.view.InputView;
import ch06.twoSolveTwenty.view.OutputView;

import java.util.Scanner;

public class BankController {
	OutputView outputView;
	InputView inputView;
	Scanner sc = new Scanner(System.in);
	String Account[] = new String[100];

	public BankController(OutputView outputView, InputView inputView) {
		this.outputView = outputView;
		this.inputView = inputView;
	}

	public void run() {
		outputView.displayMenu();
		int selectMenu = sc.nextInt();
		switch (selectMenu) {
			case 1:
				outputView.showMessage("계좌생성을 선택하였습니다.");
				createAccount();
				break;
			case 2:
				outputView.showMessage("계좌목록을 선택하였습니다.");
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

	public void createAccount() {
		String accountNum = inputView.createAccountNumber();
		String ownerName = inputView.createAccountName();
		String balance = inputView.createAccountBalance();
		Account = new String[]{accountNum, ownerName, balance};
	}
}
