package hyundai;

//import 문으로 다른 패키지 클래스 사용을 명시
import hankook.SnowTire;
import kumho.AllSeasonTire;

public class Car {
    //부품 필드 선언
    hankook.Tire tire1 = new hankook.Tire();
    kumho.Tire tire2 = new kumho.Tire();
    SnowTire tire3= new SnowTire();
    AllSeasonTire tire4 = new AllSeasonTire();
}
