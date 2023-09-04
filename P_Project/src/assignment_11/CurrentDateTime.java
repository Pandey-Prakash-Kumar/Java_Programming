package assignment_11;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class CurrentDateTime {
    public static void main(String[] args) {
    LocalDate d = LocalDate.now();
        System.out.println("Today's Date: "+d);
    LocalTime t = LocalTime.now();
        System.out.println("Time: "+t);;
    LocalDateTime dt = LocalDateTime.now();
        System.out.println("Date and Time: "+dt);
    }
}
