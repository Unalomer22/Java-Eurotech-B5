package odevler;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


        System.out.println(removeDuplicated());


    }

    public static String removeDuplicated() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Stringi giriniz: ");
        String name = scan.nextLine();
        int counter = 0;
        String sadeName = "";

        for (int i = 0; i < name.length(); i++) {

            char harf1 = name.charAt(i);
            char harf2 =' ';
            if (i != name.length() - 1) {
                harf2 = name.charAt(i + 1);
            }
            if (harf1 != harf2) {
                sadeName += harf1;

            }


        }
        return sadeName;
    }
}
