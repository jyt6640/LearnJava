package ch15.myQuestion;

import java.util.TreeSet;

public class ComparatorExample {
    static void main() {
        TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());
        treeSet.add(new Fruit("apple", 3000));
        treeSet.add(new Fruit("banana", 2000));
        treeSet.add(new Fruit("orange", 1000));

        for (Fruit fruit : treeSet) {
            System.out.println(fruit.name + " : " + fruit.price);
        }
    }
}
