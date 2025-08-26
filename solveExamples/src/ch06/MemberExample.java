package ch06;

public class MemberExample {
    public static void main(String[] args) {
        Member member1 = new Member("홍길동", "hong");

        boolean result = member1.login("hong", "12345");
        if(result) {
            System.out.println(member1.name + "님이 로그인 되었습니다.");
            member1.logout("hong");
        } else {
            System.out.println("id 또는 password가 틀립니다.");
        }

    }
}
