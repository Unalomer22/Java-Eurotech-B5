package Day17_ForLoop;

import java.util.Scanner;

public class ForLoop_S05 {
    public static void main(String[] args) {

//  18  ten 3 e kadar olan tum sayilarin toplamini hesaplayip ekrana yazdiran programi yazdirin
        System.out.println(" Lutfen bir sayi girinz");
      Scanner scan = new Scanner(System.in);
      int toplam = 0;
      int sayi = scan.nextInt();
      if ( sayi >18 ) {
          System.out.println(" Lutfen 19 dan kucuk tamsayi giriniz");
      } else {
          if (sayi>2){
            for ( int i= sayi ; i>=3 ; i--) {
              toplam = toplam + i;
          } if (sayi<2){
                  System.out.println(" Lutfen 2 den buyuk bir sayi giriniz ");
              }
          }
      }

        System.out.println(" Toplam : " + toplam);

      scan.close();
    }

    }

