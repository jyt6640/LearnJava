package ch09.sec06.exam02;

public class Button {
    //정적 멤버 인터페이스
    public static interface ClickLinstener {
        //추상 메소드
        void onClick();
    }

    //필드
    private ClickLinstener clickListener;

    //메소드
    public void setClickListener(ClickLinstener clickListener) {
        this.clickListener = clickListener;
    }
}
