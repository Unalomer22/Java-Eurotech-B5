package Day10;

public class Day10_LogicalOperator02 {
    public static void main(String[] args) {
        int x = 8;
        int y = 5;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //Short circuit &&
        System.out.println("x > y? "+ ((x < y) && (x == (y += 3 ))));
        System.out.println((x < y));
        System.out.println("Short circuit-- y = " + y);

        // &
        System.out.println("x > y? "+ ((x < y) & (x == (y += 3 ))));
        System.out.println((x > y));
        System.out.println("Short circuit değil  y = " + y);

    }
}
