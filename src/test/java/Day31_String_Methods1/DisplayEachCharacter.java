package Day31_String_Methods1;

import java.util.Scanner;

public class DisplayEachCharacter {
    public static void main(String[] args) {

        // Display each charecter in the console
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz");

        String str = scan.nextLine();

        int i = 0;
        while ( i <=str.length()-1 ) {

            System.out.println(str.charAt(i));
            i++;
        }
        // 2. yol for loop ile
        for(int k = 0; k<=str.length()-1; k++){
            System.out.println("str.charAt(k) = " + str.charAt(k));
        }
    }
}
