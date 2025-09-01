package ch14.myExampleQ.Q1;

import java.util.concurrent.Callable;

public class ArrSumCallable implements Callable<Integer> {
    int[] arr;
    int startIndex;
    int endIndex;

    //배열을 절반 나눠서 2개 만들기
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            sum += arr[i];
        }
        System.out.println(Thread.currentThread().getName() + ": " + sum);
        return sum;
    }

    public ArrSumCallable(int[] arr, int startIndex, int endIndex) {
        this.arr = arr;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }
}
