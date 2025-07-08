package ch06;

public class Korean1 {
    //인스턴스 final 필드 선언
    final String nation = "대한민국";
    final String ssn;

    //인스턴스 필드 선언
    String name;

    //생성자 선언
    public Korean1(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
