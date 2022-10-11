package Day64_Collections_List;

import java.util.*;

public class Collection_List {

    public static void main(String[] args) {
        System.out.println("List interface in Java");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Ahmet","Mehmet"));

        arrayList.add("Ali");
        arrayList.add("Veli");

        //For...loop
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("For...loop ile dizide gezmek --->  " + arrayList.get(i));
        }
        System.out.println("----------------------------");

        //For...each loop
        for(String eleman:arrayList){
            //System.out.println("eleman.toLowerCase() = " + eleman.toLowerCase());
            System.out.println("For each ile dizide gezmek ---> " + eleman);
        }
        System.out.println("----------------------------");

        //Iterator....
        Iterator<String > iterator = arrayList.iterator();

        while (iterator.hasNext()){
            System.out.println("Iterator ile dizide gezmek --->  " + iterator.next());
        }

        System.out.println("----------------------------");

        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()){
            System.out.println("ListIterator ile dizide gezmek --->" + listIterator.next());
        }

        System.out.println("----------------------------");
        listIterator = arrayList.listIterator();
        System.out.println("ListIterator ile dizide gezmek --->" + listIterator.next());
        System.out.println("ListIterator ile dizide gezmek --->" + listIterator.next());
        System.out.println("ListIterator ile dizide gezmek --->" + listIterator.next());

        System.out.println("ListIterator ile önceki eleman --->" + listIterator.previous());
        System.out.println("ListIterator ile önceki eleman --->" + listIterator.previous());



        System.out.println("---------------------");

        Collections.reverse(arrayList);
        for (String eleman: arrayList) {
            System.out.println(eleman);

        }

        Collections.sort(arrayList,Collections.reverseOrder());

        for (String eleman: arrayList) {
            System.out.println(eleman);

        }

    }

}
