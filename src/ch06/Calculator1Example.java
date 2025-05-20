package ch06;

public class Calculator1Example {
    public static void main(String[] args) {
        //객체 생성
        Calculator1 myCalcu = new Calculator1();

        //정사각형의 넓이 구하기
        double result1 = myCalcu.areaRectangle(10);

        //직사강형의 넓이 구하기
        double result2 = myCalcu.areaRectangle(10, 5);

        System.out.println("정사각형의 넓이: " + result1);
        System.out.println("직사각형의 넓이: " + result2);
    }
}
