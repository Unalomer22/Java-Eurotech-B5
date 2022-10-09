package Day11;

public class Day11_02 {

    public static void main(String[] args) {
        int a = 5;
        int p = ++a + --a + a++ + a--;
        System.out.println(p);

        /*
        Çözüm adımları
        Solution:

            a = 5 (Given)
            p = ++a + --a + a++ + a--
            p = 6 + --a + a++ + a-- (a becomes 6, pre-increment)
            p = 6 + 5 + a++ + a-- (a becomes 5, pre-decrement)
            p = 6 + 5 + 5 + a-- (a is 5, post-increment)
            p = 6 + 5 + 5 + a-- (a becomes 6)
            p = 6 + 5 + 5 + 6 (a is 6, post-decrement)
            p = 6 + 5 + 5 + 6 (a becomes 5)

            p = 22

            Output: 22
         */
    }

}
