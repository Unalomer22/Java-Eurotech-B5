package odevler;

public class odev3 {
    public static void main(String[] args) {
    int x= 50;
    int y = --x + x++ + x-- + x++;
    int z = ++x + x-- + x++ + x-- ;
    //      51    51     50   51
        System.out.println("x = " + x );
        System.out.println("y = " + y );
        System.out.println("z = " + z );



    }



}
