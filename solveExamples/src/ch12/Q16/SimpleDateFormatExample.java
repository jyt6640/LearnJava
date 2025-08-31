package ch12.Q16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
    static void main() {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분 ");
        System.out.println(sdf.format(now));
    }

}
