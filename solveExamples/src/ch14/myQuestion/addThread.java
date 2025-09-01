package ch14.myQuestion;

public class addThread extends Thread {
    private int a;
    private int b;
    private int sum;

    public addThread(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        sum = a + b;
    }

}
