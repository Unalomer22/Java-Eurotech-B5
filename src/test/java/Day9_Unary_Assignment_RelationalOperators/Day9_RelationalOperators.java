package Day9_Unary_Assignment_RelationalOperators;

public class Day9_RelationalOperators {

    public static void main(String[] args) {

        byte b1 = 1;
        byte b2 = 2;
        byte b3 = 1;
        double d1 = 3.5;
        int i1 = 17;
        float f1 = (float)67.0;

        boolean check1 = b1 < b2;
        System.out.println("check1 = " + check1);
        //System.out.println(b1 < b2);

        boolean check2 = b1 > b2;
        System.out.println("check2 = " + check2);

        boolean check3 = b1 == b2;
        System.out.println("check3 = " + check3);

        boolean check4 = b1 == b3;
        System.out.println("check4 = " + check4);

        boolean check5 = b1 != b2;
        System.out.println("check5 = " + check5);

        boolean check6 = (i1 * d1) >= (f1 - 5);
        System.out.println("check6 = " + check6);

        System.out.println((d1/i1) <= (i1/d1));

        // "=" --> assignment operator
        // "==" --> relational operator

    }


}
