package Day18_Rewiew_DoWhileLoop_Constructer;

import java.util.Scanner;

public class SoruS01_HesapMakinesi {
    /*
    Kullanicidan sayi girmesini soyleyin.
    Kullanici sifir girdiginde , ekrana o ana kadar girmis oldugu tum sayilarin toplamini yazdirin.
    Örnegin ; 5,4,7,0 ise 5+4+7 = 16 yazdirsin
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        int i = 1;
        int num = 0;

        do {
            System.out.println(" Bir sayi giriniz");
            i = scan.nextInt();
            num+=i;// num = num + i

        }while (!(i==0));

        System.out.println("Girilen sayilarin toplami = " + num);

    }
}
