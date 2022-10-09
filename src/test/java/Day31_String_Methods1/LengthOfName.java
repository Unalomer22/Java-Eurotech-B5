package Day31_String_Methods1;

import java.util.Scanner;

public class LengthOfName {

    public static void main(String[] args) {
        // Write a program that asks user to enter his/her firstname and lastname.
        // Display int the console total number of charecter

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Ad Soyad Giriniz");

        String adSoyad = scan.nextLine();

        int adSoyadLength = adSoyad.length();

        System.out.println("adSoyadLength = " + adSoyadLength);

        scan.close();
    }

    }

