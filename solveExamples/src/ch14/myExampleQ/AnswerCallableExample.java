package ch14.myExampleQ;

public class AnswerCallableExample {
    static void main() {
        try {
            java.util.concurrent.FutureTask<Integer> task1 = new java.util.concurrent.FutureTask<>(new AnswerCallable(1, 50));
            java.util.concurrent.FutureTask<Integer> task2 = new java.util.concurrent.FutureTask<>(new AnswerCallable(51, 100));

            Thread a = new Thread(task1);
            Thread b = new Thread(task2);

            a.start();
            b.start();

            int totalSum = task1.get() + task2.get();
            System.out.println("Total Sum: " + totalSum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}