package ch09.sec04.exam02;

public class A {
    //메소드
    public void method1(int arg) { //final int age
        //로컬 변수
        int var = 1; //final int var = 1;

        //로컬 클래스
        class B {
            void method2() {
                //로컬 변수 읽기
                System.out.println("arg: " + arg); //(O)
                System.out.println("var: " + var); //(O)

                //로컬 변수 수정
                //arg = 2; //(X)
                //var = 2; //(X)
            }
        }
        //로컬 객체 생성
        B b = new B();
        //로컬 객체 메소드 호출
        b.method2();

        //로컬 변수 수정
        //arg =  3; //(X)
        //var =  3; //(X)
    }
}
