package ch14.myQuestion;

import java.awt.Toolkit;

public class ThreadExample {
    static void main() {
        Beep beep = new Beep();
        beep.startBeep();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}
