package Day33_Array;

import java.util.Arrays;
import java.util.Scanner;

public class AlisverisSepeti {
    public static void main(String[] args) {

        System.out.println(" Alisveris sepeti...");

        String [] sepet = new String[5];
        Scanner scan = new Scanner(System.in);

        System.out.println(" Sepete ekleyeceginiz urunleri giriniz");

        for (int i = 0; i<sepet.length; i++){
            System.out.println((i+1) + " . urun");
            sepet[i]= scan.nextLine();
        }
        System.out.println("Sepetimdeki urunler") ;
        System.out.println(Arrays.toString(sepet));

        for ( int i = 0; i<sepet.length; i++){
            System.out.println("Sepetteki " + (i+1)+ ".urun "+ sepet[i]);
            sepet[i]= scan.nextLine();
        }
scan.close();
    }
}
