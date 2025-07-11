package ch06;

public class Korean1Example {
    public static void main(String[] args) {
        //객체 새성 시 주민등록번호와 이름 전달
        Korean1 k1 = new Korean1("123456-1234567", "김자바");

        //필드값 읽기
        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);

        //Final 필드는 값을 변경할 수 없음
        //k1.nation = "USA";
        //k1.ssn = "123-12-1234";

        //비 final 필드는 값 변경 가능
        k1.name = "김자바";
    }
}
