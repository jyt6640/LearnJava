package ch06.twoSolveTwenty;

import ch06.twoSolveTwenty.view.OutputView;
import ch06.twoSolveTwenty.controller.BankController;

public class Main {
	public static void main(String[] args) {
		OutputView outputView = new OutputView();
		BankController controller = new BankController(outputView);
		controller.run();

	}
}
