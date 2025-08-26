package ch06;

public class Member {
    String name;
    String id = "hong";
    String password = "12345";
    int age;

    Member(String name, String id) {
        this.name = name;
        this.id = id;
    }

    boolean login(String id, String password) {
        if(this.id.equals(id) && this.password.equals(password)) {
            return true;
        } else  {
            return false;
        }
    }

    void logout(String id) {
        if(this.id.equals(id)) {
            System.out.println("로그아웃 되었습니다.");
        } else {
            System.out.println("id가 틀립니다.");
        }
    }
}
