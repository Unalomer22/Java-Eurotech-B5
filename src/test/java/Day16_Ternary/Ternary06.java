package Day16_Ternary;

import java.util.Scanner;

public class Ternary06 {

    public static void main(String[] args) {
        System.out.print(" Lutfen aldiginiz puani giriniz : ");
        Scanner scan = new Scanner(System.in);
        int not = scan.nextInt();

        String puan = (not >= 90) ? "Puaniniz A" :
                (not >= 80 ) ? "Puaniniz B" :
                        (not >= 70 ) ? "Puaniniz C" :
                                (not >= 60 ) ? "Puaniniz D" :
                                        (not >= 50 ) ? "Puaniniz E" :
                                                "Kaldiniz";

        System.out.println("puan = " + puan);


    }










}
