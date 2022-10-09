package Day37_WrapperClass;

public class WrapperClass2_Tekrar {
    public static void main(String[] args) {

        int num1 = 5;
        Integer num2 = Integer.valueOf(5);
        Integer num3 = Integer.valueOf("5");
        Integer num4 = Integer.valueOf(num1);

        System.out.println("num1 = " + num1);// num1 = 5
        System.out.println("num2 = " + num2);// num2 = 5
        System.out.println("num3 = " + num3);// num3 = 5
        System.out.println("num4 = " + num4);// num4 = 5

// equals object degerlerini == ise object referencelerini karsilastiriyor
        System.out.println(num2.equals(num3));// true
        System.out.println(num2 == num3);// true
        //System.out.println(num1.equals(num4)); int cannot be dereferenced
        System.out.println(num1 == num4);// true

        float f1 = 25.5f;
        Float f2 = Float.valueOf(25.5f);
        Float f3 = Float.valueOf("25.5f");
        Float f4 = Float.valueOf(f1);

        System.out.println("f1 = " + f1);// f1 = 25.5
        System.out.println("f2 = " + f2);// f2 = 25.5
        System.out.println("f3 = " + f3);// f3 = 25.5
        System.out.println("f4 = " + f4);// f4 = 25.5
        System.out.println(f1+f2+f3+f4);// 102.0

        char c1 = 'c';
        Character c2 = Character.valueOf('c');
        // Character c3 = Character.valueOf("c");String char olmuyor
        Character c4 = Character.valueOf(c1);

        System.out.println("c1 = " + c1);// c1 = c
        System.out.println("c2 = " + c2);// c2 = c
        System.out.println("c4 = " + c4);// c3 = c

        byte b1 = 12;
        Byte b2 = Byte.valueOf((byte) 12);
        Byte b3 = Byte.valueOf("12");
        Byte b4 = Byte.valueOf(b1);

        System.out.println("b1 = " + b1);// b1 = 12
        System.out.println("b2 = " + b2);// b2 = 12
        System.out.println("b3 = " + b3);// b3 = 12
        System.out.println("b4 = " + b4);// b4 = 12

        short s1 = 1200;
        Short s2 = Short.valueOf((short) 1200);
        Short s3 = Short.valueOf("1200");
        Short s4 = Short.valueOf(s1);

        System.out.println("s1 = " + s1);// s1 = 1200
        System.out.println("s2 = " + s2);// s2 = 1200
        System.out.println("s3 = " + s3);// s3 = 1200
        System.out.println("s4 = " + s4);// s4 = 1200

        boolean bool1 = true;
        Boolean bool2 = Boolean.valueOf(true);
        Boolean bool3 = Boolean.valueOf("true");
        Boolean bool4 = Boolean.valueOf(bool1);

        System.out.println("bool1 = " + bool1);// bool1 = true
        System.out.println("bool2 = " + bool2);// bool2 = true
        System.out.println("bool3 = " + bool3);// bool3 = true
        System.out.println("bool4 = " + bool4);// bool4 = true

    }
}
