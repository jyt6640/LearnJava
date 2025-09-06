package ch06.twoSolveTwenty;

import ch06.twoSolveTwenty.view.InputView;
import ch06.twoSolveTwenty.view.OutputView;
import ch06.twoSolveTwenty.controller.BankController;

public class Main {
	public static void main(String[] args) {
		OutputView outputView = new OutputView();
		InputView inputView = new InputView();
		BankController controller = new BankController(outputView, inputView);
		controller.run();

	}
}
