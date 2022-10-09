package Day36;

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        System.out.println("Two dimensional array");
        int[][] matrix = new int[5][3];

        matrix[1][2] =10;
        System.out.println(matrix[1][0]);
        System.out.println(Arrays.deepToString(matrix));

        System.out.println("Printing two dimensional array in table format");
        for (int i = 0; i < 5; i++) { //row index
            System.out.print(i+1 + ".satır " +"[");
            for (int j = 0; j < matrix[i].length; j++) { //column index
                System.out.print(matrix[i][j]);
            }
            System.out.println("]");
        }

        int row = 10;
        int col = 3;
        int[][] matrix1 = new int[row][col];
        System.out.println();
        for (int i = 0; i < row; i++) { //row index
            System.out.print(i+1 + ".satır " +"[");
            for (int j = 0; j < col;j++) { //column index
                System.out.print(matrix1[i][j]);
            }
            System.out.println("]");
        }

        /* 5 * 5
        [[0, 0, 0, 0, 0],
        [0, 0, 0, 10, 0],
        [0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0]]

        5*3
        [[0, 0, 0],
        [0, 0, 10],
        [0, 0, 0],
        [0, 0, 0],
        [0, 0, 0]]
         */
    }
}
