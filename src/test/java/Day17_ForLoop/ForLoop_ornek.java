package Day17_ForLoop;

import java.util.Scanner;

public class ForLoop_ornek {
    public static void main(String[] args) {
      /*
    Kullanicidan baslangic ve bitis degerlerini alin.
    Bitis degerlerinden baslayip baslangic degerinde biten tum cift sayilari ekrana yazdirin.
    Örnek: Kullanici 15 ve 10 verirse ===>> 14 12 10
     */
        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen baslangic degerini giriniz");
        int bas = scan.nextInt();

        System.out.println("Lutfen bitis degerini giriniz");
        int bit = scan.nextInt();

        if (bas < bit) {
            System.out.println("Baslangic degeri bitis degerinden buyuk olmali");
        } else {
            for (int i = bas; i >= bit; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
