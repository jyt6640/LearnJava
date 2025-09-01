package ch14.myExampleQ;

public class AnswerRunnable implements Runnable {
    int startNum;
    int endNum;
    int sum = 0;

    public AnswerRunnable(int startNum, int endNum) {
        this.startNum = startNum;
        this.endNum = endNum;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = startNum; i <= endNum; i++) {
            sum += i;
        }
        System.out.println(Thread.currentThread().getName() + ": " + sum);
    }


}
