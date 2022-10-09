package Day37_WrapperClass;

import java.util.concurrent.Callable;

public class WrapperClass1 {
    public static void main(String[] args) {

        int num1 = 5;
        Integer num2 = new Integer(5);
        Integer num3 = new Integer("5");
        Integer num4 = new Integer(num1);

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        // equals() object degerlerini == ise object referencelarini karsilastiriyor
        System.out.println(num2.equals(num3)); // true
        System.out.println(num2 == num3); // false

        double d1 = 25.5;
        Double d2 = new Double(25.5);
        Double d3 = new Double("25.5");
        Double d4 = new Double(d1);

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        System.out.println("d4 = " + d4);
        System.out.println(d1 + d2 + d3);

        char c1 = 'c';
        Character c2 = new Character('c');
        //Character c3 = new Character("c");// String deger alamaz
        Character c4 = new Character(c1);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c4 = " + c4);

        byte b1 = 12;
        Byte b2 = new Byte((byte)12);
        Byte b3 = new Byte("12");
        Byte b4 = new Byte(b1);

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);

        short s1 = 1200;
        Short s2 = new Short((short)1200);
        Short s3 = new Short("1200");
        Short s4 = new Short(s1);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);

        boolean bool1 = true;
        Boolean bool2 = new Boolean(true);
        Boolean bool3 = new Boolean("true");
        Boolean bool4 = new Boolean(bool1);

        System.out.println("bool1 = " + bool1);
        System.out.println("bool2 = " + bool2);
        System.out.println("bool3 = " + bool3);
        System.out.println("bool4 = " + bool4);

    }

    }

