package ch16.example.Q1;

public class Example {
	static void main() {
		int[] numbers = {5, 12, 7, 20, 3};
		Thread thread = new Thread(
			() -> {
				//numbers 최대값
				int max = maxOrMin(numbers, true);
				System.out.println("Max: " + max);
				//numbers 최소값
				int min = maxOrMin(numbers, false);
				System.out.println("Min: " + min);
			}
		);
		thread.start();
	}

	private static int maxOrMin(int[] arr, boolean isMax) {
		int result = arr[0];
		for (int num : arr) {
			if (isMax) {
				if (num > result) {
					result = num;
				}
			} else {
				if (num < result) {
					result = num;
				}
			}
		}
		return result;
	}
}
