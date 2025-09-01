package ch14.myQuestion;

public class SumThreadExample {
    static void main() {
        SumThread sumThread = new SumThread();
        addThread addThread = new addThread(10, 20);
        addThread.start();
        System.out.println("addThread 시작");
        sumThread.start();
        System.out.println("sumThread 시작");
        try {
            sumThread.join();
            addThread.join();
        } catch (InterruptedException e) { }
        System.out.println("1~100 합: " + sumThread.getSum());
        System.out.println("10 + 20 = " + addThread.getSum());
    }
}
