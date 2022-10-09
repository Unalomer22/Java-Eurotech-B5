package GrupCalismasi;

import java.util.Arrays;

public class Arrays01 {
    /*
    1) Array lar birden fazla degeri depolamak icin kullanilir.
    2) Array lere konulan degerlerin data type leri ayni olmalidir.
    3) Array olusturuken mutlaka kac eleman yerlestirecegimizi belirtmemiz gerekir.
    4) Array ler de sadece primitive ve reference lar depolanir.
     */
    int x = 12; // Memory de bir yer ayirtip

    public static void main(String[] args) {

        // Array olusturmak

        int a[] = new int[4];

        // Arraz ı console a zaydırmak ıcınÖ
        System.out.println(Arrays.toString(a));// [0, 0, 0, 0]

        // Array e eleman ekelemek;
        a[0]= 3;
        System.out.println(Arrays.toString(a));// [3,0,0,0]

        a[2] = 7;
        System.out.println(Arrays.toString(a));// [3, 0, 7, 0]

        System.out.println(a.length);// 4

        String b[] = new String[3];

        System.out.println(Arrays.toString(b));// [null, null, null]

        b[2]= "Bekir";
        System.out.println(Arrays.toString(b));
        b[0]= "Ömer";
        b[1]= "Alper";
        System.out.println(Arrays.toString(b));// [Ömer,  Alper, Bekir]

        System.out.println(b[2]);// [Bekir]
        for(int i= 0; i<b.length; i++){
            System.out.print(b[i]+ " ");// Ömer Alper Bekir
        }
        System.out.println();

        for(int i = b.length-1; i>=0; i--) {
            System.out.print(b[i] + " ");// Bekir Alper Ömer
        }

        System.out.println();

            // b Array indeki indeksi cift olan elemanlari yazdiralim.

            for(int i = 0;i<b.length;i++){
                if(i%2==0){
                    System.out.print(b[i]+" ");// Ömer Bekir
                }
            }
            int c[]={8,15,34,3};
            Arrays.sort(c);
        System.out.println(Arrays.toString(c)); // [3, 8, 15, 34]

        Arrays.sort(b);
        System.out.println(Arrays.toString(b));// [Alper, Bekir, Ömer]

        int t[];
        t= new int[3];

        }
    }




