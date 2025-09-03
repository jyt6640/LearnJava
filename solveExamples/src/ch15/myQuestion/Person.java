package ch15.myQuestion;

public class Person implements Comparable<Person>{
    public int age;
    public String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Person person) {
        if (age == person.age) return 0;
        else if (age < person.age) return -1;
        else return 1;
    }
}
