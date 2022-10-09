package Day38_Rewiew;

import java.util.Arrays;

public class Array3_Tekrar {

     /* Write a method that accepts an array and prints an array with the elements "rotated left"
    Bir diziyi kabul eden ve "sola döndürülen(kaydirilan)" öğelerle bir dizi yazdıran bir yöntem yazın

        int [] x = {1,2,3};==> {2,3,1}
        int [] y = {17,12,10,8};==> {12,10,8,17}
        int [] z = {7,0,0};==> {0,0,7}
        */
     public static void main(String[] args) {

         int [] x = {1,2,3};
         System.out.println(Arrays.toString(x));// [1, 2, 3]
         System.out.println(Arrays.toString(rotateLeft(x))); // [2, 3, 1]

         int [] y = {17,12,10,8};
         System.out.println(Arrays.toString(y));// [17, 12, 10, 8]
         System.out.println(Arrays.toString(rotateLeft(y)));// [12, 10, 8, 17]

         int [] z = {7,0,0};
         System.out.println(Arrays.toString(z));// [7, 0, 0]
         System.out.println(Arrays.toString(rotateLeft(z)));// [0, 0, 7]

     }

    public static int [] rotateLeft (int [] arr){
         int x = arr [0];
         for(int i = 0; i<arr.length-1;i++){
             arr[i] = arr [i+1];
         }
         arr[arr.length-1]=x;
         return arr;
    }




}
