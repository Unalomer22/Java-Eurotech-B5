package Day9_Unary_Assignment_RelationalOperators;

public class Day9_UnaryOperators {
    public static void main(String[] args) {

        int num1 = +10;
        int num2 = -100;
        int sum = -(num1 + num2); // -(10 - 100)

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("sum = " + sum);

        boolean b = false;
        System.out.println(b);
        System.out.println(!b);
        System.out.println(!!b);

        int i = 10;
        int j = 5;

        i++; // i = i+1
        j--; // j = j-1

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        ++i;
        --j;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        int x = 20;
        int z = 30;

        //Increments "x" then store the new value of "x" in memory
        System.out.println(++x);
        System.out.println(x);

        //Store the value of "x" in memory then increments.
        System.out.println(z++);
        System.out.println(z);

    }
}
