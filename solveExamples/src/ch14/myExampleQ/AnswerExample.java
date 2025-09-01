package ch14.myExampleQ;

public class AnswerExample {
    static void main() {
        AnswerRunnable runnable1 = new AnswerRunnable(1, 50);
        AnswerRunnable runnable2 = new AnswerRunnable(51, 100);

        Thread a = new Thread(runnable1);
        Thread b = new Thread(runnable2);

        a.start();
        b.start();

        try {
            a.join();
            b.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalSum = runnable1.getSum() + runnable2.getSum();
        System.out.println("Total Sum: " + totalSum);

    }
}
