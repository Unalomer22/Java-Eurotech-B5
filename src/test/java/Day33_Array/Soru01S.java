package Day33_Array;

import java.util.Scanner;

public class Soru01S {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Array in lrngth ini giriniz");
        int lenght = scan.nextInt();

        int arr[] = new int[lenght];
        int i = 0;
        do {
            System.out.println("Lutfen array in index i "+ i + " olan elemanini giriniz");
            arr[i] = scan.nextInt();
            i++;
        }while (i<lenght);

     //   System.out.println(Arrays.toString(arr));
    }
}
