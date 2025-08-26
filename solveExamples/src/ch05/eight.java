package ch05;

public class eight {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int sum1 = 0;
        int sum2 = 0;
        double avg;
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                sum1 += array[i][j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            sum2 += array[i].length;
        }
        System.out.println("sum: " + sum1);
        avg = (double)sum1 / (double)sum2;
        System.out.println("avg: " + avg);
    }
}
