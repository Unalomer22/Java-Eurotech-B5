package odevler;

public class Task6 {
    public static void main(String[] args) {

        checkWord("ADRTGV5647KJMGEL","GEL");

    }

    public static void checkWord(String a, String b) {
        if (a.contains(b)) {
            System.out.println("Your parcel is delivered to your postcode: " + b + " delivered");
        }else{
            System.out.println("Your parcel is  delivered to your postcode: " + b + " not delivered");
        }
    }
}
