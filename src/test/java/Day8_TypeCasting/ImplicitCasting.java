package Day8_TypeCasting;

public class ImplicitCasting {
    public static void main (String [] args){
        int myInt = 9;
        double myDouble = myInt ;  // Implicit Casting - Automatic

        System.out.println(myInt);
        System.out.println(myDouble);

        int i = 100;
        long l= i;
        float f = l;
        double d= f;

        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);







    }

}
