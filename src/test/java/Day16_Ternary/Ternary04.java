package Day16_Ternary;

import java.util.Scanner;

public class Ternary04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Write a program that finds the absolute value( MUTLAK DEGER)  by using ternary operator
        int x = scan.nextInt();
        int  absolteValue = (x>=0) ? x : -x;
        System.out.println("absolteValue = " + absolteValue);

scan.close();
    }

}
