package ch06.ex1;

public class C2 {
    public C2() {
        //객체 생성
        A2 a = new A2();

        //필드값 변경
        a.field1 = 1; //O
        a.field2 = 1; //O
      //  a.field3 = 1; //X

        //메소드 호출
        a.method1(); //O
        a.method2(); //X
        a.method3(); //X
    }
}
