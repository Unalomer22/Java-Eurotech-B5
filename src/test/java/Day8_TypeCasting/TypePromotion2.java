package Day8_TypeCasting;

public class TypePromotion2 {

    public static void main(String[] args) {

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;

        double result = (f * b) + (i / c) + (d * s);
        System.out.println("result = " + result);

        int result2 = (int) result;
        System.out.println("result2 = " + result2);

        ////////////////

        int i1 = 5;
        int i2 = 10;
        float f1 = 15.5f;
        double d1 = 20.5;

        int result3 = i1 + i2;
        float result4 = f1 + i1;
        double result5 = d1 + i1;

        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
        System.out.println("result5 = " + result5);

    }


}
