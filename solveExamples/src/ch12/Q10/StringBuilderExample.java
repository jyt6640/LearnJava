package ch12.Q10;

public class StringBuilderExample {
    static void main() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder);
    }
}
