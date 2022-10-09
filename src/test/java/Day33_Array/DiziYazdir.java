package Day33_Array;

import java.util.Arrays;

public class DiziYazdir {
    public static void main(String[] args) {
        System.out.println(" Dizi elemanlarinin yazdirilmasi");

        /*
        String [] arabalar = {"Mazda , Murat, Sahin, Wolkswagen, BMW"}; Herbir elemana ikili kesme isareti koymadigimizda en asagidaki hata kodunu yazdirir
        System.out.println(arabalar[2]);

        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1
        at Day33_Array.DiziYazdir.main(DiziYazdir.java:8)
        */

        String [] arabalar = {"Mazda", "Murat", "Sahin", "Wolkswagen","BMW"};
        System.out.println("arabalar[0] = " + arabalar[0]);// Mazda

        System.out.println("arabalar[1] = " + arabalar[1]);// Murat
        System.out.println("arabalar[2] = " + arabalar[2]);// Sahin
        System.out.println("arabalar[3] = " + arabalar[3]);// Wolkswagen
        System.out.println("arabalar[4] = " + arabalar[4]);// BMW
        System.out.println();

        System.out.println("args = " + Arrays.deepToString(arabalar));// Dizinin tum elemanlarini yanyana yazdirir.
                                                                      // args = [Mazda, Murat, Sahin, Wolkswagen, BMW]
        System.out.println(" For Loop.......");
        for (int i = 0; i < arabalar.length; i++) {
            System.out.println(i + " indeksli elemani : " + arabalar[i]);
        }
        System.out.println();
        System.out.println(" For each metodu ile dizi elemanlarinin yazdirilmasi");

        for (String araba : arabalar){
            System.out.println("Araba adi = " + araba);
        }
        // Arrays.toString methodu
        System.out.println(" Arrays.toString()");
        System.out.println(Arrays.toString(arabalar));// Dizinin tum elemanlarini yanyana yazdirir.
    }
}
