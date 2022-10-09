package Day29;

import java.util.Scanner;

public class Exercise4_ComputeMinuteToYears2 {

    public static void main(String[] args) {

        yearsDays();
    }
    public static void yearsDays(){
        Scanner scan = new Scanner(System.in);
        double years, days ;
        System.out.println(" Lutfen dakikayi giriniz : ");

        double minute = scan.nextLong();
        years = minute / 525600 ;
        days = (minute / 1440) % 365;

        System.out.println( minute + " minutes is approximately " + years + " years and " + days + " days");

        scan.close();
    }

}
