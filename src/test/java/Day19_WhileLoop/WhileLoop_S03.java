package Day19_WhileLoop;

import java.util.Scanner;

public class WhileLoop_S03 {
    public static void main(String[] args) {
        /* Kullanicidan bir sayi aliniz. Bu sayi icin carpim tablosunu olusturunuz
        Kullanici 13 versin
        13x1= 13  13x2 = 26 ......... 13x10 = 130
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Carpim tablosunu olusturmak icin bir sayi giriniz");
        int s = scanner.nextInt();

        int i= 1;

        while ( i <= 10) {

            System.out.println(s + "x" + i + "=" + (s*i));
            i++;

        }
        scanner.close();

    }
}
