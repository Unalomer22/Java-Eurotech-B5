package DigerCalismalar;

import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Carpım tablosunu olıusturmak ıcın bır sayı gırınız");

        int s = scan.nextInt();
         int i= 1;

         do {
             System.out.println( s + "x" + i + "=" + (s*i) );
             i++;
         }
            while (i<=10);

         }
}
