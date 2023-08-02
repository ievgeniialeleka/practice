package homework;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TimeSinceBirthday {

    public static String getTimeSinceBirthday(LocalDateTime birthday) {
        LocalDateTime current = LocalDateTime.now();
        Period period = Period.between(birthday.toLocalDate(),current.toLocalDate());
        long yearsDifference = period.getYears();
        long monthsDifference = period.getMonths();
        long daysDifference = period.getDays();

        Duration duration = Duration.between(birthday,current);
        long hoursDifference = duration.toHoursPart();
        long minutesDifference = duration.toMinutesPart();
        long secondsDifference = duration.toSecondsPart();

        return "Вам исполнилось " + yearsDifference + " лет, " + monthsDifference + " месяцев, " + daysDifference + " дней, " + hoursDifference +
                " часов, " + minutesDifference + " минут, " + secondsDifference + " секунд.";
    }

    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(1987,9,23,17,30,0);
        System.out.println(getTimeSinceBirthday(birthday));
    }
}
