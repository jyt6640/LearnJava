package ch07.hyundai;

//import 문으로 다른 패키지 클래스 사용을 명시
import ch07.hankook.SnowTire;
import ch07.kumho.AllSeasonTire;

public class Car {
    //부품 필드 선언
    ch07.hankook.Tire tire1 = new ch07.hankook.Tire();
    ch07.kumho.Tire tire2 = new ch07.kumho.Tire();
    SnowTire tire3= new SnowTire();
    AllSeasonTire tire4 = new AllSeasonTire();
}
