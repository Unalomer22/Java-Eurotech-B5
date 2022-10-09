package Day33_Array;

public class DiziTemel {
    public static void main(String[] args) {

        System.out.println(" Temel dizi kavramlari");

        String[] arabalar = new String[4];
        int[] sayilar = {1,3,4,5,6};
        int [] sayilarDefault = new int[4];

        System.out.println("Sayilar dizisi.. = " + sayilar[2]); // 4
        System.out.println("Sayilar dizisi.. = " + sayilar[4]); //6

        System.out.println("SayilarDefault dizisi..  = " + sayilarDefault[3]); // 0 Default int her zaman 0 dir
        arabalar[0] = " Mazda";
        arabalar[3] = " Mercedes";

        System.out.println("Dizinin 1. elemani[0] = " + arabalar[0]);// Mazda
        System.out.println("Dizinin 2. elemani[1] = " + arabalar[1]);// null  Default String her zaman null dir
        System.out.println("Dizinin 3. elemani[2] = " + arabalar[2]);// null  Default String her zaman null dir
        System.out.println("Dizinin 4. elemani[3] = " + arabalar[3]);//  Mercedes

        System.out.println("Sayilar boyut = " + sayilar.length); // 5 dizideki eleman sayisi
        System.out.println("Sayilar dizisinin son elemani  = " +sayilar[ sayilar.length-1]); // 6
        System.out.println("Sayilar dizisinin sondan 3 gerideki elemani  = " +sayilar[ sayilar.length-3]); // 4

    }
}
