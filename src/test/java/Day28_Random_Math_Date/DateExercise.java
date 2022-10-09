package Day28_Random_Math_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateExercise {
    public static void main(String[] args) {

        Date date = new Date();

        long time = date.getTime();

        System.out.println("date = " + date);
        System.out.println("time = " + time);

        LocalDate myObj = LocalDate.now();
        System.out.println("myObj = " + myObj);

        LocalTime myTime = LocalTime.now();
        System.out.println("myTime = " + myTime);

        LocalDateTime myLocalDateTime = LocalDateTime.now();
        System.out.println("myLocalDateTime = " + myLocalDateTime);



    }
}
