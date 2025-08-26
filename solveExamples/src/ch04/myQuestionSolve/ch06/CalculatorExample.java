package ch04.myQuestionSolve.ch06;

public class CalculatorExample {
    public static void main(String[] args) {
        int sum1 = Calculator.sub(10, 5);
        System.out.println("sum1: " + sum1);
        // Calculator.add(10, 5); // This line will cause a compile-time error because add is not a static method.

        Calculator myCalc = new Calculator();
        int sum2 = myCalc.add(10, 5);
        System.out.println("sum2: " + sum2);

    }
}
