package ch17.q8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
	static void main() {
		List<Member> list = Arrays.asList(
			new Member("홍길동", "개발자"),
			new Member("김나리", "디자이너"),
			new Member("신용권", "개발자")
		);

		Map<String, List<Member>> groupingMap = list.stream()
			.collect(Collectors.groupingBy(Member::getJob));

		System.out.println("[개발자]");
		groupingMap.forEach((k,v)->{
			if(k.equals("개발자")) {
				v.forEach(m -> System.out.println(m.getName()));
			}
		});
		System.out.println();

		System.out.println("[디자이너]");
		groupingMap.forEach((k,v)->{
			if(k.equals("디자이너")) {
				v.forEach(m -> System.out.println(m.getName()));
			}
		});
	}
}
