package Day36;

import java.util.Arrays;

public class TwoDimArray_Tekrar {
    public static void main(String[] args) {
        System.out.println(" Two dimensionel array");

        int[][] matrix = new int[5][3];
        matrix[1][2] = 10;
        System.out.println(matrix[1][0]);
        System.out.println(Arrays.deepToString(matrix)); // Matrix seklinde yazmak icin

        System.out.println("Printing two dimensional array in table format");
        for (int i = 0; i < 5; i++) { // row index
            System.out.print(i + 1 + ".satir" + "[");
            for (int j = 0; j < matrix[i].length; j++) { // column index
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("]");
            System.out.println();
        }

        int row = 10;
        int col = 3;

        int[][] matrix1 = new int[row][col];
        for (int i = 0; i < row; i++) { // row index
            System.out.print(i + 1 + ".satir" + "[");
            for (int j = 0; j < col; j++) { // column index
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println("]");


        /*  5*5 lik Matrix
        [[0, 0, 0, 0, 0],       " 0. ci indeks"
        [0, 0, 0, 10, 0],       " 1. ci indeks"
        [0, 0, 0, 0, 0],        " 2. ci indeks"
        [0, 0, 0, 0, 0],        " 3. ci indeks"
        [0, 0, 0, 0, 0]]        " 4. ci indeks"

        5*3 luk Matrix
        [[0, 0, 0],
        [0, 0, 10],
        [0, 0, 0],
        [0, 0, 0],
        [0, 0, 0]]

         */


        }

    }
}