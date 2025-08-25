package ch04;

public class six {
    public static void main(String[] args) {
        int x, y, sum;
        y = 0;
        for (int i = 0; i < 60; i++) {
            x = i;
            for (int j = 0; j < 60; j++) {
                y = j;
                sum = 4 * x + 5 * y;
                if (sum == 60) {
                    System.out.println("x=" + x + ", y=" + y);
                }
            }
            sum = 4 * x + 5 * y;
            if (sum == 60) {
                System.out.println("x=" + x + ", y=" + y);
            }
        }
    }
}
