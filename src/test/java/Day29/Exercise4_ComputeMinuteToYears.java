package Day29;

import java.util.Scanner;

public class Exercise4_ComputeMinuteToYears {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       int minutes , day, year; // bu sekilde ayri ayri tanimlayabiliriz ya da birbiri cicnde tanimlayabiliriz

        System.out.println(" Enter the number of minutes... : ");

        minutes = scan.nextInt();

        year = (minutes / (365 * 24 * 60 ));
        day = (( minutes - (year * (365 * 24 * 60))) / ( 24 * 60));

        System.out.println( minutes + " minutes is approximately " + year + " years and " + day + " days");

     // 2 .YOL Solition 2

        int years1 = minutes / 525600; // 365*24*60 = 525600 BU kadar dakikanin kac yil oldugunu buluyoruz
        int remainingMinutes1 = minutes % 525600;// modulus ile yildan artan dakikayi buluyoruz
        int days1 = ( remainingMinutes1 / 1440);// Hesapladigimiz artan dakika icerisinde kac gun oldugunu buluyoruz

        System.out.println(" 2. yol  " + minutes + " minutes is approximately " + years1 + " years and " + days1 + " days" );

        scan.close();
    }

}
