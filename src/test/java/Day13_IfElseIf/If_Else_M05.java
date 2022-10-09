package Day13_IfElseIf;

import java.util.Scanner;

public class If_Else_M05 {
    public static void main(String[] args) {
        // Kullanicidan bir charecter girmesini isteyin ve girilen charecter in harf olup olmadigini yazdirin.
        Scanner scan= new Scanner(System.in);
        System.out.println(" Lutfen bir charecter giriniz");
        char charecter = scan.next().charAt(0);

        if (charecter>='A' && charecter<='Z' || charecter>= 'a' && charecter<='z'){
            System.out.println(" Girilen charecter harf");
        } else{
            System.out.println(" Girilen charecter harf degil");
        }

scan.close();

    }
}
