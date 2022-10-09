package Day36;

import java.util.Arrays;

public class TwoDimArray2_Tekrar {
    public static void main(String[] args) {
        int [][] twoDimArray = {{1,2,3},{4,5,6}};

        int [][] ikiBoyutluDizi = new int[2][3];

        ikiBoyutluDizi[0][0]= 1;
        ikiBoyutluDizi[0][1]= 2;
        ikiBoyutluDizi[0][2]= 3;

        ikiBoyutluDizi[1][0]= 4;
        ikiBoyutluDizi[1][1]= 5;
        ikiBoyutluDizi[1][2]= 6;


        System.out.println(Arrays.deepToString(twoDimArray));
        System.out.println();

        System.out.println(Arrays.deepToString(ikiBoyutluDizi));
        System.out.println(ikiBoyutluDizi[1][2]);


    }
}
