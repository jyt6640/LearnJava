package ch13.sec02.exam02;

public class GenericExample {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        System.out.println("1.-------------------");
        Home home = homeAgency.rent();
        System.out.println("2.-------------------");
        home.turnOnLight();
        System.out.println("3.-------------------");
        CarAgency carAgency = new CarAgency();
        System.out.println("4.-------------------");
        Car car = carAgency.rent();
        System.out.println("5.-------------------");
        car.run();
        System.out.println("6.-------------------");
    }
}
