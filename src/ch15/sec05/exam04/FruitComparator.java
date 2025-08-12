package ch15.sec05.exam04;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        if(o1.price < o2.price) {
            return -1; // o1이 o2보다 작음
        } else if(o1.price == o2.price) {
            return 0; // o1과 o2가 같음
        } else {
            return 1; // o1이 o2보다 큼
        }
    }
}
