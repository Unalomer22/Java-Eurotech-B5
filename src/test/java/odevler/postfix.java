package odevler;

public class postfix{
    public static void main(String[] args) {

        int a = 5;
        int p = ++a + --a + a++ + a--;
        System.out.println("p : " + p);
        System.out.println(a);
        System.out.println();
        /*int f = ++a + --a * a++ + a--;
        int x, y, z, t ;
        x = ++a ;
        System.out.println(x);
        y = --a ;
        System.out.println(y);
        z = a++ ;
        System.out.println(z);
        t = a--;
        System.out.println(t);
        System.out.println("f : " + f);
*/
        int f = ++a + --a * a++ + a--;
            //    6   +  5   * 5  + 6  = 37
        int r = --a * a++ + ++a + a--;
            // 4    * 4   +   6  + 6   = 28
        int s = a++ * --a + ++a + a--;
            //   5  *  5   + 6  + 6  = 37
        int x, y, z, t ;
        y = --a ;
        System.out.println(y);
        z = a++ ;
        System.out.println(z);
        x = ++a ;
        System.out.println(x);
        t = a--;
        System.out.println(t);

        System.out.println("f : " + f);
        System.out.println("r = " + r);
        System.out.println("s = " + s);


    }
}
