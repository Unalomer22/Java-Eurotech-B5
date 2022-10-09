package Day33_Array;

import java.util.Scanner;

public class Dizi_olmayan_sayiToplam {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int girilenSayi, toplam, i ;
        toplam = 0; girilenSayi = 0;
        for (i = 1; i <= 5; i++)
        {
            System.out.print("Bir sayı giriniz: ");
            girilenSayi = giris.nextInt();
            toplam = toplam + girilenSayi;
        }
        System.out.println(i-1+ " adet sayı girdiniz.");
        System.out.println("Girdiğiniz sayıların toplamı = " +toplam);
    }
}

