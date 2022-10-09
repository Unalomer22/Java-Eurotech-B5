package odevler;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter firstname and lastname: ");
        String name = scan.nextLine();
        for (int i = 0; i <= name.length() - 1; i++) {
            System.out.println(name.charAt(i));
        }
        int nameNumber = name.length();
        System.out.println("nameNumber = " + nameNumber);
    }
}
