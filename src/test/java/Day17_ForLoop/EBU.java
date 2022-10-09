package Day17_ForLoop;

import java.util.Scanner;

public class EBU {

    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin ve o sayi kadar konsola Selamun aleykum yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen bir sayi giriniz");
        int sayi = scan.nextInt(); //5
        for(int i = 0; i< sayi; i++){
            System.out.println("Bekir im danke");
        }



    }
}
