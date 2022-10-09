package Day17_ForLoop;

import java.util.Scanner;

public class ForLoop_S03 {
    public static void main(String[] args) {
      /*
    Kullanicidan bir sayi alin.
    O sayidan kucuk ve esit olan tum positif tek sayilari buyukten kucuge dogru ayni satirda aralarina bosluk birakarak ekrana yazdirin.
    Örnek: Kullanici 15 ve 10 verirse ===>> 14 12 10
     */
        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        if (sayi<1) {
            System.out.println(" Positif bir tam sayi giriniz.");
        } else {
            for ( int i=sayi ; i>=1 ; i--){
                if ( i %2 !=0) {
                    System.out.print( i + " ");
                }
            }
        }
    }
}