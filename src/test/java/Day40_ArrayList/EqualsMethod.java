package Day40_ArrayList;

import java.util.ArrayList;

public class EqualsMethod {


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

        if (monts.equals(list1)){
            System.out.println("Both has all list1 ");// Both has all list1
        }else{
            System.out.println("Both has not all list1 ");
        }


    }
}