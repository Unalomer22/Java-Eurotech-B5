package Day19_WhileLoop;

public class WhileLoop_06 {
    public static void main(String[] args) {
        /*  Bu kod ekrana birsy yazdirmaz!!!!!!!
        int i = 1;
        while ( i<10)
        if ( i%2== 0)
            System.out.println(i);
*/
/*  Bu kod ekrana birsy yazdirmaz!!!!!!!
        int i = 1;
        while ( i<10)
            if ( i%2== 0)
                System.out.println(i++);
*/
        int i1 = 1;
        while ( i1<10)
            if ( (++i1) %2== 0)  // ++i prefix
                System.out.println(i1);

        System.out.println("******************");

        int i = 1;
        while ( i<10)
            if ( (i++) %2== 0)    // i++
                System.out.println(i);




    }
}
