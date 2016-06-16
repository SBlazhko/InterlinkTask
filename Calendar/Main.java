package Calendar;

import java.time.LocalDate;
import static Calendar.CalendarLogic.getDate;
import static Calendar.CalendarLogic.printCalendar;
import static Calendar.CalendarLogic.setCalendar;

/**
 * Created by BlazhkoS on 15.06.2016.
 */
public class Main {

    public static void main(String[] args) {
        LocalDate today = getDate();
        setCalendar(today);
        printCalendar();

    }
}
