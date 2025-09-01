package ch14.myExampleQ;

public class Thread2 extends Thread {
    int n;

    public Thread2(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 51; i <= n; i++) {
            sum += i;
        }
        System.out.println(Thread.currentThread().getName() + ": " + sum);
    }
}
