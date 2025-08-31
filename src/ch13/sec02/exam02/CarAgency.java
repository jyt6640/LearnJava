package ch13.sec02.exam02;

public class CarAgency implements Rentable<Car> {
    @Override
    public Car rent() {
        System.out.println("자동차를 렌트합니다.");
        return new Car();
    }
}
