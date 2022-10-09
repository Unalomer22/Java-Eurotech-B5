package Day13_IfElseIf;

import java.util.Scanner;

public class If_Else_M02 {

    public static void main(String[] args) {

        /* Kullanicidan gun isimlerinden birinin ilk harfini isteyin.
        O harfle baslayan gun isimlerini yazdirin.
        Örnek: Ilk harf = P , output = "Pazar, Pazartesi veya Persembe"
                Ilk harf = S , output = "Sali"
    Buyuk harf ya da kucuk harf problemi olmamasi icin toUpperCase methodunu kullanin
        */
    Scanner scan = new Scanner(System.in);
    System.out.println(" Lutfen istediginiz gun isminin ilk harfini giriniz");
    // 1. yol
    char harf = scan.next().toLowerCase().charAt(0); // Tek karakteri char olarak da alabiliriz fakat char primitive tir, methodu yoktur.

      if (harf=='p' || harf=='P'){
          System.out.println("pazartesi, persembe veya pazar");
      }
    if ( harf=='s' || harf=='S'){
        System.out.println(" Sali");
    }
    if (harf=='c' || harf=='C'){
            System.out.println("carsamba,cuma veya cumartesi");
        }
    if (harf!= 'p' && harf != 'c' && harf != 's'){
        System.out.println(" Lutfen gecerli bir harf giriniz");
    }




    }
}
