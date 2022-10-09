package Day53_FinalKeyword_MethodHiding;

public class FinalArrays {
    public static void main(String[] args) {

        int[] Teams = {11,12};
        System.out.println(Teams[0]);
        System.out.println(Teams[1]);

        Teams[0] = 21;
        Teams[1] = 22;
        System.out.println(Teams[0]);
        System.out.println(Teams[1]);

        int[] Teams2 = {31,32};

        Teams = Teams2;
        System.out.println(Teams[0]);
        System.out.println(Teams[1]);

        ///////////////////

        final int [] Teams3  = {41,42};

        System.out.println(Teams3[0]);
        System.out.println(Teams3[1]);

        Teams3[0] = 51;
        Teams3[1] = 52;
        System.out.println(Teams3[0]);
        System.out.println(Teams3[1]);

        int[] Teams4 = {61,62};

        //Teams3 = Teams4;
        System.out.println(Teams3[0]);
        System.out.println(Teams3[1]);

    }

}
