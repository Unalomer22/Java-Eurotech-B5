package DigerCalismalar;

import java.util.Scanner;

public class Method04 {
    public static void main(String[] args) {
        // sayiToplami();
        int carpim = sayiToplami() * 10;
        System.out.println("carpim = " + carpim);
    }

    public static int sayiToplami(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int a = scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int b = scan.nextInt();
        return a + b;
    }
}
