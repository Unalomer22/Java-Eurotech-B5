package Day40_ArrayList;

import java.util.ArrayList;

public class ContainsMethod {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Jan");
        list1.add("Feb");
        list1.add("Mar");
        list1.add("Apr");
        list1.add("May");

        System.out.println(list1.toString());// [Jan, Feb, Mar, Apr, May]

        ArrayList<String> list2 = list1;

        System.out.println(list2.toString());// [Jan, Feb, Mar, Apr, May]

        ArrayList<String> monts = new ArrayList<>(list1);
        System.out.println(monts.toString());// [Jan, Feb, Mar, Apr, May]

        System.out.println(monts.contains("Jan"));//true
        System.out.println(monts.contains("Dec"));//false

        // how to check if Feb is in second position
        System.out.println(monts.indexOf("Feb")==1);//true
        System.out.println(monts.get(1).equals("Feb"));//true

        System.out.println("list1 = " + list1.toString());// list1 = [Jan, Feb, Mar, Apr, May]
        System.out.println("monts = " + monts.toString());// monts = [Jan, Feb, Mar, Apr, May]

        if (monts.containsAll(list1)){
            System.out.println("Monts has all list1");// Monts has all list1
        }else{
            System.out.println("Monts has not all list1");
        }

    }
}
