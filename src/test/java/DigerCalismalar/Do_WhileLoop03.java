package DigerCalismalar;

import java.util.Scanner;

public class Do_WhileLoop03 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi aliniz.
        Aldığınız sayı 10 dan kucuk ıse ekrana "Kazandınız" yazdırın
        Eger sayı 10 veya 10 dan buyuk ıse ekrana  " Tekrar bir sayı gırınız" yazdırın.
         */

    Scanner scan = new Scanner(System.in);
    int s = 0;
     do {
         System.out.println("Lutfen bır sayı gırınız");
         s = scan.nextInt();;
     }while (s>=10);
        System.out.println("Kazandınız");
    }
}
