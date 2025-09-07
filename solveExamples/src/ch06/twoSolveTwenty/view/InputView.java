package ch06.twoSolveTwenty.view;

import java.util.Scanner;

public class InputView {
	Scanner sc = new Scanner(System.in);
	public String createAccountNumber() {
		System.out.print("계좌번호> ");
		return sc.nextLine();
	}

	public String createAccountName() {
		System.out.print("예금주> ");
		return sc.nextLine();
	}

	public int createAccountBalance() {
		System.out.print("초기입금액> ");
		String input = sc.nextLine();
		return Integer.parseInt(input);
	}

}
