package Day17_ForLoop;

import java.util.Scanner;

public class ForLoop_S11 {
    public static void main(String[] args) {
        /* For loop kullanarak asagida verilen sekli olusturunuz.Satir sayisini kullanicidan aliniz
                    *
                   * *
                  * * *
                 * * * *
                * * * * *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println(" Olusturulacak ucgenin satir sayisini giriniz");
        int s = scan.nextInt();

        for ( int i=1 ; i<=s ; i++){ // s = satirlar icin

            // Space ler icin loop
            for (int k = s-1; k>=i ; k--){
                System.out.print(" ");
            }
            // * ler icin loop
            for ( int m =1 ; m<=i ; m++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
