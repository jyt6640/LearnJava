package ch12.Q5;

import java.util.HashSet;

public class StudentExample {
    static void main() {
        //Student를 저장하는 HashSet 생성
        HashSet<Student> hashSet = new HashSet<Student>();

        //Student 저장
        hashSet.add(new Student("1"));
        hashSet.add(new Student("1")); //동일한 학번 저장
        hashSet.add(new Student("2"));

        //저장된 Student 수 출력
        System.out.println("저장된 Student 수: " + hashSet.size());

    }
}
