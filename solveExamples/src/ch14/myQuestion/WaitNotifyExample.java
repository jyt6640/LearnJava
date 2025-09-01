package ch14.myQuestion;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WaitNotifyExample {
    static void main() {
        WorkObject workObjectA = new WorkObject();
        WorkObject B = new WorkObject();

        ThreadA threadA = new ThreadA(workObjectA);
        ThreadB threadB = new ThreadB(workObjectA);

        threadA.start();
        threadB.start();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Executor executor = Executors.newFixedThreadPool(4);
    }
}
