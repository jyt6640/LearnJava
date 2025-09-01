package ch14.myQuestion;

public class Beep {

    public void startBeep() {
        t.start();
    }

    Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
            for (int i = 0; i < 5; i++) {
                toolkit.beep();
                try { Thread.sleep(500); } catch (Exception e) {}
            }
        }
    });

}
