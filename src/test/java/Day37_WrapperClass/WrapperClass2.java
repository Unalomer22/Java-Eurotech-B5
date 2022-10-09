package Day37_WrapperClass;

public class WrapperClass2 {
    public static void main(String[] args) {
        int num1 = 5;

        Integer num2 = Integer.valueOf(5);
        Integer num3 = Integer.valueOf("5");
        Integer num4 = Integer.valueOf(num1);
        System.out.println(num4.intValue());
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        // equals object degerlerini == ise object referencelerini karsilastiriyor
        System.out.println(num2.equals(num3));// true
        System.out.println(num2 == num3);// true

        float f1 = 25.5f;
        Float f2 = Float.valueOf(25.5f);
        Float f3 = Float.valueOf("25.5f");
        Float f4 = Float.valueOf(f1);

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);

        char c1 = 'c';
        Character c2 = Character.valueOf('c');
        // Character c3 = Character.valueOf("c");String char olmuyor
        Character c4 = Character.valueOf(c1);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c4 = " + c4);

        byte b1 = 12;
        Byte b2 = Byte.valueOf((byte) 12);
        Byte b3 = Byte.valueOf("12");
        Byte b4 = Byte.valueOf(b1);

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);

        short s1 = 1200;
        Short s2 = Short.valueOf((short) 1200);
        Short s3 = Short.valueOf("1200");
        Short s4 = Short.valueOf(s1);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);

        boolean bool1 = true;
        Boolean bool2 = Boolean.valueOf(true);
        Boolean bool3 = Boolean.valueOf("true");
        Boolean bool4 = Boolean.valueOf(bool1);

        System.out.println("bool1 = " + bool1);
        System.out.println("bool2 = " + bool2);
        System.out.println("bool3 = " + bool3);
        System.out.println("bool4 = " + bool4);


    }
}
