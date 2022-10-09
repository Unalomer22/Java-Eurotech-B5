package Day13_IfElseIf;

import java.util.Scanner;

public class If_Else_M03 {
    public static void main(String[] args) {
        /*
        Kullanicidan dikdortgenin kenar uzunluklarini isteyin.
        Dikdortgenin kare olup olmadigini yazdirin.

         */
        Scanner scan= new Scanner (System.in);
        System.out.println(" Lutfen kenar uzunluklarindsn birini tamsayi olarak giriniz");
        int kenar1 = scan.nextInt();

        System.out.println(" Lutfen kenar uzunluklarindan digerini tamsayi olarak giriniz");
        int kenar2 = scan.nextInt();

        if( kenar1==kenar2){
            System.out.println(" Dikdortgen bir kare dir.");
        }
        if (kenar1!=kenar2){
            System.out.println(" Dikdortgen bir kare degildir");
        }

        scan.close();


    }
}
