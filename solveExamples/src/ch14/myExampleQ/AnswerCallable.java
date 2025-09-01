package ch14.myExampleQ;

import java.util.concurrent.Callable;

public class AnswerCallable implements Callable<Integer> {
    int startNum;
    int endNum;

    public AnswerCallable(int startNum, int endNum) {
        this.startNum = startNum;
        this.endNum = endNum;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = startNum; i <= endNum; i++) {
            sum += i;
        }
        System.out.println(Thread.currentThread().getName() + ": " + sum);
        return sum;
    }
}
