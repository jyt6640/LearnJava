package ch15.myQuestion;

import java.util.Set;
import java.util.TreeSet;

public class ComparableExample {
    static void main() {
        TreeSet<Person> set = new TreeSet<>();
        set.add(new Person("홍길동", 45));
        set.add(new Person("김삿갓", 25));
        set.add(new Person("이몽룡", 30));
        set.add(new Person("성춘향", 25));

        for (Person p : set) {
            System.out.println(p.name + " : " + p.age);
        }
    }
}
