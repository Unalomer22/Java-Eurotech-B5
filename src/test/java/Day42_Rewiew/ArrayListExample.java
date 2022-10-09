package Day42_Rewiew;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        ArrayList<String> list = new ArrayList<String>(); // Creating Arraylist
        list.add("Mango");// Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        //Printing Arraylist
        System.out.println(list);// [Mango, Apple, Banana, Grapes]

        // Traversing list through for-each loop
        for(String fruit : list)
            System.out.println(fruit);/* Mango
                                         Apple
                                         Banana
                                         Grapes
*/
    }
}
