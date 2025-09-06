package ch06.twoSolveTwenty.controller;

import ch06.twoSolveTwenty.view.OutputView;

import java.util.Scanner;

public class BankController {
	OutputView outputView;
	Scanner sc = new Scanner(System.in);

	public BankController(OutputView outputView) {
		this.outputView = outputView;
	}

	public void run() {
		outputView.displayMenu();
		int selectMenu = sc.nextInt();
	}
}
