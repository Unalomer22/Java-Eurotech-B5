package Day11;

public class Day11_01 {
    public static void main(String[] args) {
       /*
        int a = 1;
        int result = -a-- + a++ / -a-- * --a;
        System.out.println("a = " + a);
        System.out.println("result = " + result);
        */

        int a = 1;
        int result;

        int result1, result2, result3, result4;

        result1 = -a--;
        result2 = a++;
        result3 = -a--;
        result4 = --a;
        result = result1 + result2 / result3 * result4;
        System.out.println("a = " + a);
        System.out.println("result = " + result);
    }
}
