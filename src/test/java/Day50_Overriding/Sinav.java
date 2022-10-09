package Day50_Overriding;

import java.util.Arrays;

public class Sinav {
    public static void main(String[] args) {

        int [] nums = {6,-4,12,0,-10};
        int x = 12;
        int y = Arrays.binarySearch(nums,x);
        System.out.println(y);

        int [][] arr = {{2,4,6,8},{1,2,3,4}};
        System.out.println(arr.toString());
    }
}
