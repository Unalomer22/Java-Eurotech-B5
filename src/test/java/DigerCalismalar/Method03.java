package DigerCalismalar;

import java.util.Scanner;

public class Method03 {
    /*
    kullanıcıdan 2 deger alın bunları farklı bır methodda toplayın sonrasında maın methodda 10 ıle carpın
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int a = scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int b = scan.nextInt();
      // sayiToplami(3,5);
       int carpim = sayiToplami(a,b)* 10;
        System.out.println("carpim = " + carpim);
    }
    private static int sayiToplami(int c, int d) {
     //   int toplam = c+d;
        // return toplam;
        return c+d;
    }

}
