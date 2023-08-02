package lesson_code;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDT {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);

        System.out.println("==========================");

        //слияние двух объектов
        LocalDateTime localFromTime = localTime.atDate(localDate);
        LocalDateTime localFromDate = localDate.atTime(localTime);

        System.out.println(localFromTime);
        System.out.println(localFromDate);

        System.out.println("==========================");

        localFromDate = localDate.atTime(12, 00, 45, 01);
        System.out.println(localFromDate);

        System.out.println("============================");
        localDate = localDate.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        System.out.println(localDate);

    }
}
