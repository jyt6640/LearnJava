package ch12.Q5.moreStudy;

import java.util.HashSet;

public class PeopleExample {
    static void main() {
        HashSet<People> hashSet = new HashSet<People>();
        hashSet.add(new People("김인직", 1));
        hashSet.add(new People("김인직", 1));
        hashSet.add(new People("김인직", 2));
        hashSet.add(new People("김참직", 2));

        System.out.println("총 객체 수: " + hashSet.size());
    }
}
