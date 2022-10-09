package Day8_TypeCasting;

public class CastingToChar {

    public static void main(String[] args) {

        char ch = 'c';

        int num = 88;

        ch = (char) num; // Explicit - int to char
        System.out.println("char deger = " + ch);

        int num2 = ch; // Implicit - char to int
        System.out.println("num2 = " + num2);

        // Boolean can not be converted any data type
        boolean bl = true;
        //int i1 = (int) bl;
    }




}
