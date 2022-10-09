package Day17_ForLoop;

public class ForLoop_Continue {
    public static void main(String[] args) {

        System.out.println(" For Loop continue ifadesi....");

        for ( int i=1 ; i<=10 ; i++){
            if ( i%2 != 0){
                continue;
            }
            System.out.println(i);
        }



    }
}
