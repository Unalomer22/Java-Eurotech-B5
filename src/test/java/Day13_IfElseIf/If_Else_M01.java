package Day13_IfElseIf;

import java.util.Scanner;

public class If_Else_M01 {
    public static void main(String[] args) {

        // Kullanicidan bir tam sayi isteyin ve sayinin tek veya cift oldugunu yazdirin.

        Scanner scan = new Scanner( System.in);
        System.out.println(" Bir sayi giriniz");
        int girilenSayi = scan.nextInt();

        if ( girilenSayi%2==0){
            System.out.println(" Girdiginiz sayi Cift sayi");
        }
        if ( girilenSayi%2==1){
            System.out.println(" Girdiginiz sayi Tek tir.");
        }
        if (girilenSayi<0) {
            System.out.println(" Lutfen positif bir sayi giriniz");
        }
        scan.close();
    }
}
