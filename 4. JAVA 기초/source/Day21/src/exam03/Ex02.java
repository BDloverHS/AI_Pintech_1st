package exam03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Ex02 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate today2 = LocalDate.of(4, 2, 29);

        int year1 = today2.get(ChronoField.YEAR);
        int month1 = today2.get(ChronoField.MONTH_OF_YEAR);
        int day1 = today2.get(ChronoField.DAY_OF_MONTH);
        DayOfWeek dayweek = today2.getDayOfWeek();

        String yoil = dayweek.getDisplayName(TextStyle.SHORT, Locale.KOREA);
        System.out.println(yoil + "요일");

        System.out.println(today2);

        /*
        int year = today.get(ChronoField.YEAR);
        int month = today.get(ChronoField.MONTH_OF_YEAR);
        int day = today.get(ChronoField.DAY_OF_MONTH);
        */

        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.printf("year=%d, month=%d, day=%d%n", year, month, day);
    }
}
