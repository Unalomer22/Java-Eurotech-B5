package Day40_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        /*
        1) List ler primitive data type larini kabul etmez. Onlarin yerine Wrapper Class lari kullaniriz
         */

        // ArrayList olusturmak
        //1.YOL
        //ArrayList<Integer> liste1 = new ArrayList<Integer>();
        // 2.YOL
        //ArrayList<Integer> liste2 = new ArrayList<>();
        // 3.YOL
        List<String> ls = new ArrayList<>();
        System.out.println("ls = " + ls);// []

        // List e eleman eklemenin 2 yolu vardir.
        ls.add("B");
        ls.add("M");
        ls.add("A");
        System.out.println("ls = " + ls);// ls = [B, M, A]

        ls.add(1,"K");
        System.out.println("ls = " + ls);// ls = [B, K, M, A]

        ls.add(0,"S");
        System.out.println("ls = " + ls);// ls = [S, B, K, M, A]

        ls.add(3,"T");
        System.out.println("ls = " + ls);// ls = [S, B, K, T, M, A]

        // List in icindeki eleman sayiyini bulmak icin;
        // Array lerin eleman sayiyindan bahsederken " Array in lenght i deyiniz
        // List lerin eleman sayiyindan bahsederken " List in size i deyiniz

        System.out.println(ls.size()); // 6

        // Bir List in bos olup olmadigini kontrol etmek
        System.out.println(ls.isEmpty());// false

        // Bir List den index kullanarak eleman silmek
        // Index ile remove() methodunu kullanip ekrana yazdirirsaniz, Java sildigi elemani ekrana yazdirir.
        System.out.println(ls.remove(2)); // K  // index i 2 olan eleman (K) silindi

        System.out.println("ls = " + ls);// ls = [S, B, T, M, A]

        // Bir List den eleman ismi ile eleman silmek
        System.out.println(ls.remove("T"));// true
        System.out.println("ls = " + ls);// ls = [S, B, M, A]

        System.out.println(ls.remove("X"));// false
        System.out.println("ls = " + ls);// ls = [S, B, M, A]
        ls.add("M");
        System.out.println("ls = " + ls);// ls = [S, B, M, A, M]

        ls.remove("M");// iki adet M harfinden soldakini sildi
        System.out.println("ls = " + ls);// ls = [S, B, A, M]

    }
}
