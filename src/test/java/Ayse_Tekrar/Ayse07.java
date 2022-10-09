package Ayse_Tekrar;

public class Ayse07 {

    public static String check(int [] x, int[] y){
        if(!(x.length>1)){
            return "Array 1 gecersiz";
        }

        if(!(y.length>1)){
            return "Array 2 gecersiz";
        }

        if (x[0]==y[0] || x[x.length-1]== y[y.length-1]){
            return "true";
        }
        else {
            return "false";
        }

    }
    public static void main(String[] args) {
        int [] x = {1,2,3};
        int [] y = {1,2,3};
        System.out.println(check(x,y));
    }
}
