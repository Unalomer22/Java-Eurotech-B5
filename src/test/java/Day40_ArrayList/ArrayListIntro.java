package Day40_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListIntro {
    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<String > names = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>();

        // Assigning values to ArrayList

        names.add("Ahmet");
        names.add("Ayse");
        names.add("Hasan");
        names.add("Emine");

        numbers.add(99);
        System.out.println(numbers.add(99)); // True
        numbers.add(23);
        numbers.add(45);
        numbers.add(67);
        // numbers.add("123"); burada hata verir, yazdirmaz
        numbers.add(new Integer("123"));

        // Reading values from ArrayList
        System.out.println(names.get(0));// Ahmet
        System.out.println(names.get(1));// Ayse
        System.out.println(names.get(2));// Hasan
        System.out.println(names.get(3));// Emine

        System.out.println(numbers.get(0));// 99
        System.out.println(numbers.get(1));// 99
        System.out.println(numbers.get(2));// 23
        System.out.println(numbers.get(3));// 45

        System.out.println("names count : " + names.size()); // size bize eleman sayisini verdirir. names count : 4
        System.out.println("numbers count : " + numbers.size()); // numbers count : 6

        System.out.println(names.toString());// [Ahmet, Ayse, Hasan, Emine]
        System.out.println(numbers.toString());// [99, 99, 23, 45, 67, 123]

        String  str = numbers.toString();// numbers integer olmasina ragmen , toString methodu numbers i Stringe cevirdi
        String  str2 = names.toString();

        System.out.println(numbers.toString());// [99, 99, 23, 45, 67, 123]

        System.out.println("-----------------");
        // How to sort a list by ascending order
        Collections.sort(numbers);// Sayilari kucukten buyuge siralar
        System.out.println(numbers.toString());// [23, 45, 67, 99, 99, 123]

        Collections.reverse(numbers);// Sayilari buyukten kucuge siralar
        System.out.println(numbers.toString());
    }
}
