package ch17.sec11;

import java.util.List;
import java.util.Arrays;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
            new Student("홍길동", 92),
            new Student("신용권", 95),
            new Student("유미선", 88)
        );
        //방법1
        int sum1 = studentList.stream()
                .mapToInt(Student::getScore)
                .sum();
        //방법2
        int sum2 = studentList.stream()
                .mapToInt(Student::getScore)
                .reduce(0, (a, b) -> a + b);

        System.out.println("총점1: " + sum1);
        System.out.println("총점2: " + sum2);
    }
}
