package odevler;

public class ddd {

    public static void main(String[] args) {

        int a = 1;
        int x, y, z, t, k;
        y = a++;
        System.out.println(y);

        z = -a--;
        System.out.println(z);

        x = y / z;
        System.out.println(x);

        t = --a;
        k = x * t;

        //int result = -a-- + a++ / -a-- * --a;
        // int result = z + y / z * t ;
        //int result = z + x * t ;
        int result = z + k;
        System.out.println("a : " + a);
        System.out.println("y : " + y);
        System.out.println("z = " + z);
        System.out.println("x : " + x);
        System.out.println("result : " + result);

    }
}