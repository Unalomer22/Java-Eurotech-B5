package Day9_Unary_Assignment_RelationalOperators;

public class Day9_PrePostDecrementIncrement02 {

    public static void main(String[] args) {

        int x = 50;
        int y = --x + x++ + x-- + x++;

        // x -> 49 -> 50 -> 49 -> 50 // x = 50
        // y -> 49 + 49 + 50 + 49 + 50

        System.out.println("x = " + x); // 50
        System.out.println("y = " + y); // 197

    }


}
