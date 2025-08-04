package ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet hashSset = new HashSet();

        Student s1 = new Student(1,"홍길동");
        hashSset.add(s1);
        System.out.println("저장된 객체 수: " + hashSset.size());

        Student s2 = new Student(1,"홍길동");
        hashSset.add(s2);
        System.out.println("저장된 객체 수: " + hashSset.size());

        Student s3 = new Student(2,"홍길동");
        hashSset.add(s3);
        System.out.println("저장된 객체 수: " + hashSset.size());
    }
}
