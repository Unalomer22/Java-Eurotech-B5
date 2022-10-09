package Day38_Rewiew;

public class Array1 {

    public static void main(String[] args) {
        /* Write a method that accepts an array and return true(boolean) if 6(int) appers as either the first or last element in
         the array. The array will be lenght 1 or more.

        int [] x = {1,2,6};// true
        int [] y = {6,1,2,3};// true
        int [] z = {13,6,1,2,3};// false
        */
        int [] x = {1,2,6};
        boolean b1 = firstLast6(x);
        System.out.println("b1 = " + b1);

        int [] y = {6,1,2,3};
        boolean b2 = firstLast6(y);
        System.out.println("b2 = " + b2);

        int [] z = {13,6,1,2,3};
        boolean b3 = firstLast6(z);
        System.out.println("b3 = " + b3);

        int [] g = {13,1,2,3,6};
        boolean b4 = firstLast6(g);
        System.out.println("b4 = " + b4);
    }
    public static boolean firstLast6(int[] array){

        if ( array.length<1){
            return false;
        }

        if(array[0]==6 || array[array.length-1]==6){
            return true;
        }else {
            return false;
        }
    }

}
