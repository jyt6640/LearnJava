package ch14.Q2;

public class ThreadExample {
    static void main() {
        Thread thread1 = new MovieThread();
        thread1.start();

        Thread thread2 = new Thread(new MusicRunnable());
        thread2.start();
    }
}
