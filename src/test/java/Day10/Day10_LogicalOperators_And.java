package Day10;

public class Day10_LogicalOperators_And {

    public static void main(String[] args) {
        int x = 8;
        int y = 5;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        // && Logical operator işlemi
        //Short circuit &&
        System.out.println("&& Logical operator işlemi ");
        System.out.println();
        System.out.println("x > y? "+ ((x < y) && (x == (y += 3 ))));
        System.out.println((x < y));
        System.out.println("Short circuit-- y = " + y);
        System.out.println();

        // &
        System.out.println("x > y? "+ ((x < y) & (x == (y += 3 ))));
        System.out.println((x > y));
        System.out.println("Short circuit değil  y = " + y);
        System.out.println();
        System.out.println();

    }
}
