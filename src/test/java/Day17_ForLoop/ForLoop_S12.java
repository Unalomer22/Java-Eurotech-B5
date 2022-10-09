package Day17_ForLoop;

import java.util.Scanner;

public class ForLoop_S12 {
    public static void main(String[] args) {

        /* For loop kullanarak asagida verilen sekli olusturunuz.Satir sayisini kullanicidan aliniz
                         * * * * *
                          * * * *
                           * * *
                            * *
                             *
         */
    Scanner scan = new Scanner(System.in);
    System.out.println(" Olusturmak istediginiz sekil icin lutfen satir sayisini giriniz");
    int s = scan.nextInt();

    for ( int i=0 ; i<s ; i++){ // satir sayisi

        for(int m=0; m<i ; m++) { // Space sayisi
            System.out.print(" ");

        }
        for( int k=1 ; k<=s-i ; k++){ // Yildiz sayisi
            System.out.print("* ");
        }

        System.out.println();

    }








    }
}
