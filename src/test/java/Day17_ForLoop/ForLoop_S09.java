package Day17_ForLoop;

import java.util.Scanner;

public class ForLoop_S09 {
    public static void main(String[] args) {

        // Baslangic degerinden bitis degerine kadar tum sayilarin carpimini hesaplayan programi yaziniz.
        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen baslangic degerini giriniz");
        int bas = scan.nextInt();

        System.out.println(" Lutfen bitis degerini giriniz");
        int bit = scan.nextInt();

        int carpim = 1;

        if (bas>= bit){
            for ( int i= bas ; i>=bit ; i--){
                carpim = carpim * i;
            }
        } else {

            for (int i = bas; i <= bit; i++) {
                carpim = carpim * i;
            }
        }
        System.out.println(" Carpim : " + carpim);

        scan.close();
    }
}
