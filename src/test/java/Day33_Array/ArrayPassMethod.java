package Day33_Array;

import java.util.Scanner;

public class ArrayPassMethod {
    public static void sepetList(String[] liste){
        System.out.println(" Methoda geldim....urunleri yazdiriyorum");
        for (int i = 0; i<liste.length;i++){
            System.out.println("Sepetteki " + (i+1) +". urun " + liste[i]);
        }

        System.out.println();
        System.out.println(" For each yontemiyle listelenen sepet");
        int j= 0;
        for(String urun: liste){
            j++;
            System.out.println("Sepetteki " + j +". urun " + urun);
    }

    }
    public static void main(String[] args) {
        System.out.println(" Passing array to method");
        String [] sepet = new String[3];

        Scanner scan = new Scanner(System.in);

        System.out.println(" Sepete ekleyeceginiz urunleri giriniz");

        for (int i = 0; i<sepet.length; i++){
            System.out.print((i+1) + " . urun ");
            sepet[i]= scan.nextLine();
        }
        sepetList(sepet);// Method call...passing array as parameter
        scan.close();
    }
}
