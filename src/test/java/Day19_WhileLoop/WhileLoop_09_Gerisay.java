package Day19_WhileLoop;

import java.util.Scanner;

public class WhileLoop_09_Gerisay {
    public static void main(String[] args) {
        System.out.println("While loop geri sayım");
        Scanner degerGir = new Scanner(System.in);

        System.out.print("Klavyeden geri sayım için bir sayı giriniz..: ");
        int sayi = degerGir.nextInt();

        while (sayi >= 0){
            //System.out.print("\r" + "sayi = " + sayi);
           // if(sayi%5==0) Eger 5 e bolumunden kalan sifir olan sayilari yazdirmak isteseydik bunu yazardik
            System.out.println("sayi = " + sayi);
            sayi--;

        }

    }
}







