package Day19_WhileLoop;

public class WhileLoop_S02 {

    public static void main(String[] args) {

        // While_ Loop kullanarak " Java kolaydir" String ini tersten yazdiriniz.
        String s = " Java kolaydir";

        int n = s.length()-1;

        while (n>=0 ) {

            System.out.print(s.charAt(n));
            n--;
        }

    }

}
