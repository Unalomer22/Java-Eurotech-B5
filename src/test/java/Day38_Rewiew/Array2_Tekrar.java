package Day38_Rewiew;

public class Array2_Tekrar {
    public static void main(String[] args) {

        int [] x = {1,2,3};
        System.out.println(firstLastEqual(x));// false

        int [] y = {1,2,3,1};
        System.out.println(firstLastEqual(y));// true

        int [] z = {1,2,1};
        System.out.println(firstLastEqual(z));// true

        int [] k = {1};
        System.out.println(firstLastEqual(k));// not a valid array

    }
    public static String firstLastEqual (int [] arr){

        if (!(arr.length>1)){
            return "not a valid array";

        }if ( arr[0]==arr[arr.length-1]){
            return "true";
        }else{
           return "false";
        }
    }
}
