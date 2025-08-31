package ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home> {
    @Override
    public Home rent() {
        System.out.println("집을 렌트합니다.");
        return new Home();
    }
}