package Day8_TypeCasting;

public class ExplicitCasting {

    public static void main(String[] args) {

        double myDouble = 9.99;
        int myInt = (int) myDouble; // Explicit Casting - Manual
        double myDouble2 = myInt;

        System.out.println("myDouble = " + myDouble);
        System.out.println("myInt = " + myInt);
        System.out.println("myDouble2 = " + myDouble2);

        double d = 100.04;
        long l = (long) d;
        int i = (int) l;

        System.out.println("d = " + d);
        System.out.println("l = " + l);
        System.out.println("i = " + i);

    }




}
