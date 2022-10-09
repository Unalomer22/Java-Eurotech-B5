package Day16_Ternary;

import java.util.Scanner;

public class Ternary_M07 {
    public static void main(String[] args) {

        // Kullanicidan dikdortgenin uzunlugunu ve genisligini alin,
        // girilen degerlere gore dikdorgenin kare olup olmadigini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println(" Lutfen iki kenar uzunlugu giriniz");

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();

        System.out.println( kenar1<= 0 || kenar2<=0 ? "Lutfen gecerli bir uzunluk giriniz" : kenar1==kenar2 ? " Kare" : " Kare degil");

        scan.close();

    }
}
