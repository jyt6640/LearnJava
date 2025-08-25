package ch04;

public class five {
    public static void main(String[] args) {
        double a = 0, b = 0;
        int sum = 0;
        while (true) {
            a = Math.random();
            a = a * 10;
            if ((int) a == 0 || (int) a > 6) {
                continue;
            }
            b = Math.random();
            b = b * 10;
            if ((int) b == 0 || (int) b > 6) {
                continue;
            }

            sum = (int) a + (int) b;
            System.out.println((int) a + " + " + (int) b + " = " + sum);
            if (sum == 5) {
                break;
            }
        }


    }
}
