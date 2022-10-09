package Day16_Ternary;

import java.util.Scanner;

public class Ternary_M06 {
    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” ,
        // buyuk harfse consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin.

         Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");

        char harf = scan.next().charAt(0);
     System.out.println(harf >=  'a' && harf<= 'z' ? "Kucuk harf" : harf>= 'A' && harf<= 'Z' ? " BUYUK HARF " : " GIRDIGINIZ CHARECTER HARF DEGIL") ;




    }

}