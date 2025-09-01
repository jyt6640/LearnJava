package ch14.myQuestion;

public class WorkObject {
    public synchronized void methodA() {
        System.out.println("methodA() 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) { }
    }

    public synchronized void methodB() {
        System.out.println("methodB() 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) { }
    }
}
