package ch06.ex1;

public class A2 {
    //public 접근 제한을 갖는 필드 선언
    public int field1;
    //default 접근 제한을 갖는 필드 선언
    int field2;
    //private 접근 제한을 갖는 필드 선언
    private int field3;

    //생성자 선언
    public A2() {
        field1 = 1; //O
        field2 = 1; //O
        field3 = 1; //O

        method1(); //O
        method2(); //O
        method3(); //O
    }

    //public 접근 제한을 갖는 메소드 선언
    public void method1() {}

    //default 접근 제한을 갖는 메소드 선언
    public void method2() {}

    //private 접근 제한을 갖는 메소드 선언
    public void method3() {}
}
