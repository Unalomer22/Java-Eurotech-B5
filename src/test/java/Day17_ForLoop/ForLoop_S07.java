package Day17_ForLoop;

import java.util.Scanner;

public class ForLoop_S07 {
    public static void main(String[] args) {
        // Baslangic ve bitis degerlerini kullanicidan alin.
        // Baslangic degerinden bitis degerine kadar tum sayilarin toplamini hesaplayan programi yaziniz.
         Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen baslangic degerini giriniz");
        int bas = scan.nextInt();

        System.out.println(" Lutfen bitis degerini giriniz");
        int bit = scan.nextInt();

        int toplam = 0;

        for ( int i=bas; i<=bit ; i++){
            toplam = toplam + i;

        }

        System.out.println("Toplam : " + toplam);

scan.close();
    }
}
