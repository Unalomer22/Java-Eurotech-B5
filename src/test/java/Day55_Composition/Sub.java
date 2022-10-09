package Day55_Composition;

public class Sub extends Super{

    /*
    public boolean question() {
        return true;
    }
     */

    public static boolean question() {
        return true;
    }

    public  void getSubDescription(){
        System.out.println("Description " +question() );
    }
}
