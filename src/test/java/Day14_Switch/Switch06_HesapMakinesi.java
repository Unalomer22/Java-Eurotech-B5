package Day14_Switch;

import java.util.Scanner;

public class Switch06_HesapMakinesi {
    public static void main(String[] args) {
        System.out.println("Hesap Makinesi");
        System.out.println("İşlem operatörleri ---: '+'  '-'  '*'  '/' ");
        System.out.println();

        Scanner sayi_islemGir = new Scanner(System.in);
        int sonuc = 0;

        System.out.print("Bir sayi giriniz  : ");
        int sayi1 = sayi_islemGir.nextInt();

        System.out.print("Bir islem giriniz : ");
        char islem = sayi_islemGir.next().charAt(0);

        System.out.print("Bir sayi giriniz  : ");
        int sayi2 = sayi_islemGir.nextInt();


        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                System.out.println("İşlem Sonucu      : " + sonuc);
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                System.out.println("İşlem Sonucu      : " + sonuc);
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                System.out.println("İşlem Sonucu      : " + sonuc);
                break;
            case '/':
                sonuc = sayi1 / sayi2;
                System.out.println("İşlem Sonucu      : " + sonuc);
                break;
            default:
                System.out.println("Hatalı işlem");
        }
        sayi_islemGir.close();
    }
}
