package Day16_Ternary;

import java.util.Scanner;

public class Ternary_M04 {
    public static void main(String[] args) {
        // Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen bir sayi giriniz");

        double sayi = scan.nextDouble();

        System.out.println( sayi > 0 ? sayi : -1 * sayi);
        scan.close();

        // Bu soruyu if ile yaparsak;
        if ( sayi>=0){
            System.out.println(" Girdiginiz sayinin mutlak degeri : " + sayi);
        } else {
            System.out.println(" Girdiginiz sayinin mutlak degeri : " + -sayi);
        }


    }
}
