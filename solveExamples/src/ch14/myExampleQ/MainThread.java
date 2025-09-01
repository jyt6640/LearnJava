package ch14.myExampleQ;

public class MainThread {
    static void main() {
        Thread1 thread1 = new Thread1(50);
        Thread2 thread2 = new Thread2(100);
        thread1.start();
        thread2.start();
    }
}
