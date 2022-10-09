package odevler;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        // Write a return method that can reverse a String
        // Ex: Reverse("ABCD"); ==> DCBA


        Reverse();

    }

    public static void Reverse() {
        Scanner scan = new Scanner(System.in);
        String reverse ="", original;
        System.out.println("Lutfen bir String giriniz: ");
        original = scan.nextLine();
        for (int i = original.length() - 1; i >= 0; i--) {

            reverse = reverse + original.charAt(i);
        }
        System.out.println("reverse = " + reverse);
    }
}
