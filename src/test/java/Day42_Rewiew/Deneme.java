package Day42_Rewiew;

import java.util.Locale;

public class Deneme {
    public static String buyukHarfeCevir(String a){
        a = a.trim();
       a = a.toLowerCase().replace(a.charAt(0),a.toUpperCase().charAt(0));
        return a;
    }
    public static void main(String[] args) {
        String a = "ahMet";
        String k = "aYnUr";
        char b;
        a = a.toUpperCase();
        System.out.println(a);// AHMET
        b = a.charAt(0);
        System.out.println(b);// A
        a = a.toLowerCase();
        System.out.println(a);// ahmet
        a = a.replace(a.charAt(0),b);
        System.out.println(a);// Ahmet

        System.out.println(a.replace(a.charAt(0), '6'));// 6hmet
        System.out.println();
        System.out.println("----------------");
        // Method Chaining
        System.out.println(k.toLowerCase().replace(k.charAt(0),k.toUpperCase().charAt(0)));// Aynur


        a = a.toLowerCase().replace(a.charAt(3),'c');
        System.out.println(a);// ahmct

        System.out.println(buyukHarfeCevir(" merhaba"));// Merhaba

    }
}
