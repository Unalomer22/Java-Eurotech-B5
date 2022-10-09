package Day42_Rewiew;

public class WrapperClasses {
    public static void main(String[] args) {
        byte b = 122;
        short s = 245;
        int i = 245678;
        long lng = 400000000;
        float flt = 1500.0f;
        double dbl = 34660.0;
        char chr= 'k';
        boolean bool = true;

        // Autoboxing: Converting primitives into Wrapper Classses objects
        Byte byteWrapper = b;
        Short shortWrapper = s;
        Integer intWrapper = i;
        Long longWrapper = lng;
        Float floatWrapper = flt;
        Double doubleWrapper = dbl;
        Character charWrapper = chr;
        Boolean booleanWrapper = bool;

        // Printig Wrapper Classes objects
        System.out.println("Printing Wrapper Class(objects) values... ");
        System.out.println("------------------------------------------");
        System.out.println("Byte object  = " + byteWrapper);// Byte object  = 122
        System.out.println("Short object = " + shortWrapper);// Short object = 245
        System.out.println("Integer object = " + intWrapper);// Integer object = 245678
        System.out.println("Long object = " + longWrapper);// Long object = 400000000
        System.out.println("Float object = " + floatWrapper);// Float object = 1500.0
        System.out.println("Double object = " + doubleWrapper);// Double object = 34660.0
        System.out.println("Character object = " + charWrapper);// Character object = k
        System.out.println("Boolean object = " + booleanWrapper);// Boolean object = true

        // Unboxing : Converting Wrapper Classes objects to Primitive
        byte bytevalue = byteWrapper;
        short shortvalue = shortWrapper;
        int intvalue = intWrapper;
        long longvalue = longWrapper;
        float floatvalue = floatWrapper;
        double doublevalue = doubleWrapper;
        char charvalue = charWrapper;
        boolean booleanvalue = booleanWrapper;

        // Printig primitives
        System.out.println();
        System.out.println("Printig primitive values");
        System.out.println("------------------------");
        System.out.println("byte value = " + bytevalue);// byte value = 122
        System.out.println("short value = " + shortvalue);// short value = 245
        System.out.println("int value = " + intvalue);// int value = 245678
        System.out.println("long value = " + longvalue);// long value = 400000000
        System.out.println("float value = " + floatvalue);// float value = 1500.0
        System.out.println("double value = " + doublevalue);// double value = 34660.0
        System.out.println("char value = " + charvalue);// char value = k
        System.out.println("boolean value = " + booleanvalue);// boolean value = true



    }

}
