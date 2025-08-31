package ch12.Q8;

public class nanoTime {
    static void main() {
        long startTime = System.nanoTime();
        int[] scores = new int[1000];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = i;
        }

        int sum = 0;
        for(int score : scores) {
            sum += score;
        }

        double avg = sum / scores.length;
        System.out.println(avg);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Duration: " + duration + " nanoseconds");
    }
}
