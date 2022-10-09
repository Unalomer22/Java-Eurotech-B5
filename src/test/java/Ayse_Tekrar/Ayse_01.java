package Ayse_Tekrar;

import java.util.Scanner;

public class Ayse_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bır altsayı giriniz");
        int alt= scan.nextInt();
        System.out.println("Lutfen bir ustsayı giriniz");
        int ust= scan.nextInt();
/*
      double sonuc= Math.pow ( alt,ust);
        System.out.println("sonuc = " + sonuc);
*/      int carpim=1;
        for( int i=1; i<=ust ; i++) {
            carpim = carpim * alt; // carpım *= alt
        }
        System.out.println("carpim = " + carpim);
        /*
            int carpim1 = 1;
            int k = 1;
            while (k<= ust){
                System.out.println("k = " + k);
                carpim1= carpim1 * alt;
                k++;
            }

         */
        }

    }

