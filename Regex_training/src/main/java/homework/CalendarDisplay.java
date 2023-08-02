package homework;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDisplay {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        int today = gc.get(Calendar.DAY_OF_MONTH);
        int month = gc.get(Calendar.MONTH);

        gc.set(Calendar.DAY_OF_MONTH, 1);

        int weekday = gc.get(Calendar.DAY_OF_WEEK);
        System.out.println(weekday);
        System.out.println(" SUN   MON   TUE   WED   THU   FRI   SAT");

        for(int i = Calendar.SUNDAY; i < weekday; i++) {
            System.out.print("      ");
        }

        do {
            int day = gc.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%4d",day);
            if(day == today) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
            if(weekday == Calendar.SATURDAY) {
                System.out.println();
            }
            gc.add(Calendar.DAY_OF_MONTH, 1);
            weekday = gc.get(Calendar.DAY_OF_WEEK);
        } while (gc.get(Calendar.MONTH) == month);
    }
}
