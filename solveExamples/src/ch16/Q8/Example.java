package ch16.Q8;

public class Example {
	private static Student[] students = {
		new Student("홍길동", 90, 96),
		new Student("김삿갓", 95, 93)
	};

	public static double avg(Function <Student> fun, Student[] arr) {
		double sum = 0;
		for (Student s : arr) {
			sum += fun.apply(s);
		}
		return sum / arr.length;
	}

	static void main() {
		//메소드 참조
		double engAvg = avg(Student :: getEnglishScore, students);
		System.out.println("영어 평균: " + engAvg);

		double mathAvg = avg(Student :: getMathScore, students);
		System.out.println("수학 평균: " + mathAvg);
	}
}
