package ch14.myQuestion;

public class nameThread extends Thread {
    private String name;
    public boolean work = true;

    public nameThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            if (work) {
                System.out.println(name);
            } else {
                Thread.yield();
            }
        }
    }
}
