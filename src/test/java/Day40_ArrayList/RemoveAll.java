package Day40_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(30);
        list1.add(12);
        list1.add(22);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(335);
        list2.add(3230);
        list2.add(530);
        list2.add(30);
        list2.add(12);
        list2.add(22);

        System.out.println(list1.toString());// [30, 12, 22]
        System.out.println(list2.toString());// [335, 3230, 530, 30, 12, 22]

        list2.removeAll(list1);// Liste 2 den , Liste 1 dekileri cikarttik
        System.out.println(list2.toString());//[335, 3230, 530]

    // Tek satirda listelemek icin
        ArrayList<String > listone = new ArrayList<>(Arrays.asList("a","b","c","d"));
        System.out.println(listone.toString());// [a, b, c, d]

    }
}
