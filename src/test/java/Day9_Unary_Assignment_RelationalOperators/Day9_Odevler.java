package Day9_Unary_Assignment_RelationalOperators;

public class Day9_Odevler {
    public static void main(String[] args) {


        // Odev1
        int a = 1;
        int result = -a-- + a++ / -a-- * -a;
        System.out.println("a = " + a);

        // Odev2
        int x = 4;
        int y = x * 4 - x++;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
