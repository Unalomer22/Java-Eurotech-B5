package Day17_ForLoop;

import java.util.Scanner;

public class ForLoop_S02 {

    public static void main(String[] args) {
      /*
    Kullanicidan baslangic ve bitis degerlerini alin.
    Baslangic degerlerinden baslayip bitis degerinde biten tum cift sayilari ekrana yazdirin.
    Örnek: Kullanici 10 ve 15 verirse ===>> 10 11 12 13 14 15
     */
        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen baslangic degerini giriniz");
        int bas = scan.nextInt();

        System.out.println("Lutfen bitis degerini giriniz");
        int bit = scan.nextInt();

        if (bas > bit) {
            System.out.println("Baslangic degeri bitis degerinden kucuk olmali");
        } else {
            for (int i = bas; i <= bit; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}