package ch06.twoSolveTwenty.view;

public class OutputView {
	public void displayMenu() {
		System.out.println("----------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("----------------------------------------------");
		System.out.print("선택> ");
	}

	public void showMessage(String message) { System.out.println(message); }
}
