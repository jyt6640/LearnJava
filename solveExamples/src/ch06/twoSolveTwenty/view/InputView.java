package ch06.twoSolveTwenty.view;

import java.util.Scanner;

public class InputView {
	Scanner sc = new Scanner(System.in);
	public String createAccountNumber() {
		System.out.print("계좌생성> ");
		return sc.nextLine();
	}

	public String createAccountName() {
		System.out.println("예금주> ");
		return sc.nextLine();
	}

	public String createAccountBalance() {
		System.out.println("초기입금액> ");
		return sc.nextLine();
	}

}
