package Day28_Random_Math_Date;

public class MathExercise {

    public static void main(String[] args) {
        // Math math = new Math(); Constructer private oldugundan object create etmeye izin vermiyor.

        double pi = Math.PI;
        System.out.println("pi = " + pi);// pi = 3.141592653589793

        double pow = Math.pow(3.0,3.0);
        System.out.println("pow = " + pow);// 27.0

        int pow2= (int) Math.pow(3.0,3.0);
        System.out.println("pow2 = " + pow2);// 27

        double sqrt = Math.sqrt(9.0);
        System.out.println("sqrt = " + sqrt); // 3

        System.out.println(Math.round(4.5)); // 5 e yuvarlar, bucuk ve üzerini üst sayıya yuvarlar
        System.out.println(Math.round(4.4)); // 4 e yuvarlar

        System.out.println(Math.floor(5.9));// 5 e yuvarlar : floor methodu asagı yuvarlar
        System.out.println(Math.floor(5.1));// 5 e yuvarlar

        System.out.println(Math.ceil(5.9));// 6 a yuvarlar : ceil methodu yukarı yuvarlar
        System.out.println(Math.ceil(5.1));// 6 a yuvarlar
    }

}
