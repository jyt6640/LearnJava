package ch14.myQuestion;

public class nameThreadExample {
    static void main() {
        nameThread nameThreadA = new nameThread("김인직");
        nameThread nameThreadB = new nameThread("김참직");
        nameThreadA.start();
        nameThreadB.start();

        try { Thread.sleep(5000); } catch (InterruptedException e) {}
        nameThreadA.work = false;

        try { Thread.sleep(10000); } catch (InterruptedException e) {}
        nameThreadA.work = true;
    }
}
