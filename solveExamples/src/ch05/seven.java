package ch05;

public class seven {
    public static void main(String[] args) {
        int[] array = { 1,5,3,8,2 };
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
            System.out.println("maxIndex: " + maxIndex + ", value: " + array[maxIndex]);
        }
    }
}
