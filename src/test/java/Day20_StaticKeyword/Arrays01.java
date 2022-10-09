package Day20_StaticKeyword;

import java.util.Arrays;

public class Arrays01 {
    int x = 12;

    public static void main(String[] args) {
        // Array olusturmak icin
        int a[] = new int[4];

        // Array i consola yazdirmak icin;
        System.out.println(Arrays.toString(a));// [0, 0, 0, 0]

        // Array e eleman eklemek
        a[0] = 8;
        System.out.println(Arrays.toString(a));// [8, 0, 0, 0]

        a[2] = 25;
        System.out.println(Arrays.toString(a));// [8, 0, 25, 0]

        a[3] = 8;
        System.out.println(Arrays.toString(a));// [8, 0, 25, 8]

        a[1] = 13;
        System.out.println(Arrays.toString(a));// [8, 13, 25, 8]

        // Array da kac eleman oldugunu bulmak
        System.out.println(a.length);// 4

        // String Array olusturma
        String b [] = new String[3];
        System.out.println(Arrays.toString(b));// [null, null, null]

        b[0] = "Ali";
        System.out.println(Arrays.toString(b));// [Ali, null, null]

        b[1] = "Ayse";
        System.out.println(Arrays.toString(b));// [Ali, Ayse, null]

        b[2] = "Veli";
        System.out.println(Arrays.toString(b));// [Ali, Ayse, Veli]
/*
        3 numarali index yok, o yuzden "ArrayIndexOutOfBoundsException" hatasi verir
        b[3] = "Yok ki";
        System.out.println(Arrays.toString(b));// [Ali, null, null]
*/
        // Bir array den specific bir elemani yazdirmak
        System.out.println(b[0]);// Ali
        System.out.println(b[1]);// Ayse
        System.out.println(b[2]);// Veli

        // b array indeki elemanlari yan yana console a yazdiriniz
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println();
        // a array indeki elemanlari ayni satira önlerine * koyarak tersten yazdiriniz
        System.out.println(Arrays.toString(a));// [8, 13, 25, 8]
        for (int i = a.length-1; i>=0 ; i--) {
            System.out.print(" *" +a[i]);//  *8 *25 *13 *8

        }
        System.out.println();
        // a array inde indexi cift olan elemanlari yazdiriniz
        for (int i = 0; i < a.length; i++) {
            if (i %2 == 0){
                System.out.println(a[i]);// 8 ve 25
            }
        }

        // Array deki elemanlari kucukten buyuge siralamak (ascendig order)
        // a array indeki elemanlari kucukten buyuge siralayiniz

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));// [8, 8, 13, 25]

        // Arrays.sort() methodunu b array i icin kullaniniz
        // String array lerde sort methodu alfabetik siralama yapar
        // Java da kucukten buyuge ya da alfabetik siralamaya "Naturel Order denir
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));// [Ali, Ayse, Veli]


    }
}
