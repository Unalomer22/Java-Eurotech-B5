package Day29;

import java.util.Scanner;

public class Exercise4_ComputeMinuteToYears3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter seconds : ");
        int second = scan.nextInt();

        int minute = second / 60;
        int hour = minute / 60 ;

        second = second % 60;
        minute = minute % 60;
        hour = hour % 24;

        System.out.println(hour + " hours " + minute + " minutes " + second + " seconds");

        scan.close();



    }
}
