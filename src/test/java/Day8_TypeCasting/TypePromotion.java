package Day8_TypeCasting;

public class TypePromotion {

    public static void main(String[] args) {

        short num1 = 10;
        short num2 = 20;

        //short sum = num1 + num2;
        int sum = num1 + num2;
        System.out.println("sum = " + sum);

        short sum2 = (short)(num1 + num2);
        System.out.println("sum2 = " + sum2);

        byte b1 = 2;

        //byte b2 = b1 * 3;
        int b2 = b1 * 3;
        System.out.println("b2 = " + b2);

    }




}
