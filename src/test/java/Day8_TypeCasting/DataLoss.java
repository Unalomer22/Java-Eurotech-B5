package Day8_TypeCasting;

public class DataLoss {

    public static void main(String[] args) {

        byte b;
        int i = 257;
        double d = 323.48;

        // b % 256 = 1 // Explicit Casting - Data loss
        b = (byte) i;
        System.out.println("int deger i = " + i +", byte deger b = " + b);

        // b % 256 = 67 // Explicit Casting - Data loss - Memory + kusurat
        b = (byte) d;
        System.out.println("double deger d = " + d +", byte deger b = " + b);

    }




}
