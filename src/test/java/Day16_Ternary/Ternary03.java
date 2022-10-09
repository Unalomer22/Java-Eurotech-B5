package Day16_Ternary;

import java.util.Scanner;

public class Ternary03 {
    public static void main(String[] args) {

        // Write a program that finds out whether  the number is odd or even.
        // Sayının tek mi çift mi olduğunu bulan programı yazınız.
       Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        String result = ( x%2==0) ? "Even Number (Cift sayi)" : "Odd Number (Tek sayi)";
        System.out.println(result);

        System.out.println("************************************");
    }
}
