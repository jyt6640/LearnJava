package ch14.myExampleQ;

public class Thread1 extends Thread {
    int n;

    public Thread1(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(Thread.currentThread().getName() + ": " + sum);
    }
}
