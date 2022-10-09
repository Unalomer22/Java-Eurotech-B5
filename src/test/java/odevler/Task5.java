package odevler;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter firstname and lastname: ");
        String name= scan.nextLine();
        for (int i = 0; i <name.length() ; i++) {
            System.out.println(name.charAt(i));
        }
    }
}
