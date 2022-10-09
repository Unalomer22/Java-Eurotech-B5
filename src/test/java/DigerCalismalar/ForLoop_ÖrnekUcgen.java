package DigerCalismalar;

import java.util.Scanner;

public class ForLoop_ÖrnekUcgen {

    public static void main(String[] args) {

        Scanner scan = new Scanner( System.in);
        System.out.println(" Lutfen bır sayı gırınız");
        int s = scan.nextInt();

        for( int i=0 ; i<s ; i++) { // satır sayısı
            for ( int k=0 ; k<i ; k++) {
                System.out.print(" ");
            }
                for ( int m=1 ; m< 2*(s-i); m++) {
                    System.out.print("*");
                }
            System.out.println();
            }
        }
    }


