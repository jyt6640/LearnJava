package ch06;

public class Calculator2Example {
    public static void main(String[] args) {
        double result1 = 10 * 10 * Calculator2.pi;
        int result2 = Calculator2.plus(10, 20);
        int result3 = Calculator2.minus(10, 20);

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
    }
}
