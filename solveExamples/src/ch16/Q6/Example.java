package ch16.Q6;

public class Example {
	public static double calc(Function fun) {
		double x = 10;
		double y = 4;
		return fun.apply(x, y);
	}

	static void main() {
		double result = calc((x, y) -> x / y);
		System.out.println(result);
	}
}
