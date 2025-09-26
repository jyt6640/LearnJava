package ch17.q5;

import java.util.Arrays;
import java.util.List;

public class Example {
	static void main() {
		List<String> list = Arrays.asList(
			"This is a java book",
			"Lambda Expressions",
			"Java8 supports method references"
		);
		list.stream()
			.filter(s -> s.contains("java") || s.contains("Java"))
			.forEach(System.out::println);

	}
}
