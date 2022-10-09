package Day16_Ternary;

import java.util.Scanner;

public class Ternary_M03 {
    public static void main(String[] args) {

        // Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin.
         Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen iki sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println( sayi1 > sayi2 ? sayi2 : sayi1);

// Kullanicidan iki sayi alin ve buyuk olan sayiyi yazdirin.
 //   iki sayi esit oldugunda bu kural ternary de cevapsiz kalir o yuzden if else methodunu kullanmak gerekir





    }
}
