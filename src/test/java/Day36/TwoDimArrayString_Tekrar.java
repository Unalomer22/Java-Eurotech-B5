package Day36;

import java.util.Arrays;

public class TwoDimArrayString_Tekrar {
    public static void main(String[] args) {
        System.out.println("Two dim array of string");
        String [] array = new String[]{"Ahmet", "Mehmet", " Fatma"};

        System.out.println(Arrays.toString(array));// Tek boyutlu Array i yazdirmak icin "Arrays.toString()"

        // Now lets create two dim array of string

        String [][] arrayTwoDim = new String[][]{{"Mustafa","Ahmet"},{"Ayse","Melek"}};
        System.out.println(Arrays.deepToString(arrayTwoDim));// Cift boyutlu Array i yazdirmak icin "Arrays.deepToString()"

        for (int i = 0; i < arrayTwoDim.length; i++) {
            System.out.print(i + 1 + ".satir" + "[");
            for (int j = 0; j < arrayTwoDim[i].length; j++) {
                System.out.print(arrayTwoDim[i][j] + ", ");
            }
            System.out.print( "]");
            System.out.println();

        }




    }
}
