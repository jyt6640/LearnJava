package ch12.sec11.exam03;

public class GetResourceExample {
    public static void main(String[] args) {
        Class clazz = GetResourceExample.class;

        String photo1Path = clazz.getResource("photo1.jpg").getPath();
        String photo2Path = clazz.getResource("images/photo2.jpg").getPath();

        System.out.println(photo1Path);
        System.out.println(photo2Path);
    }
}
