package ch12.Q15;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HowLongEndYearExample {
    static void main() {
        LocalDate now = LocalDate.now();
        LocalDate lastDay = LocalDate.of(2025, 12, 31);
        long remainDay = now.until(lastDay, ChronoUnit.DAYS);

        System.out.println("오늘: " + now);
        System.out.println("2025년 마지막 날: " + lastDay);
        System.out.println("2025년까지 남은 날: " + remainDay + "일");
    }
}
