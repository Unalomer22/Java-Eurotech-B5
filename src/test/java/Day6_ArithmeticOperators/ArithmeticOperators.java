package Day6_ArithmeticOperators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int addition, subtraction, division, multiplication, modulo;
        int num1 = 10;
        int num2 = 3;

        addition = num1 + num2;
        System.out.println("toplama: " + addition);

        subtraction = num1 - num2;
        System.out.println("cikarma: " + subtraction);

        division = num1 / num2;
        System.out.println("bolme: " + division);

        multiplication = num1 * num2;
        System.out.println("carpma: " + multiplication);

        modulo = num1 % num2;
        System.out.println("modulo: " + modulo);

        System.out.println(10 + 3);
        System.out.println("10 + 3");

        // Java O a bolme isleminde hata veriyor
        //System.out.println(10 / 0);
        System.out.println(0/10);

        double num3 = 10.0;
        double num4 = 3.5;
        System.out.println(num3 - num4);



    }



}
