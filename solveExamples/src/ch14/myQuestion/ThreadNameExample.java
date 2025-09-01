package ch14.myQuestion;

public class ThreadNameExample {
    static void main() {
        Thread mainThread = Thread.currentThread();
        System.out.println("Main Thread Name: " + mainThread.getName());

        for (int i = 0; i < 28; i++) {
            Thread threadA = new Thread() {
                @Override
                public void run() {
                    System.out.println("Thread A Name: " + getName());
                }
            };
            threadA.start();
        }

        Thread chatThread = new Thread() {
            @Override
            public void run() {
                System.out.println("Chat Thread Name: " + getName());
            }
        };
        chatThread.setName("ChatThread");
        chatThread.start();
    }
}
