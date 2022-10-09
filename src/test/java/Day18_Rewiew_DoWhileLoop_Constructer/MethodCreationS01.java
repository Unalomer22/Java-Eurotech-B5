package Day18_Rewiew_DoWhileLoop_Constructer;

public class MethodCreationS01 {

    // Static method un icinde kullanilan hersey statik olmalidir

    public static void main(String[] args) {
        toplama (3,5);// 8.0
        toplama(6.3,1.2);// 7.5

        carpma(2,3);// 2 ve 3 argument olarak adlandirilir // 6
        carpma(2.3,3.4);// 7.8199999
        carpma(2,3.5);// 7.0
        carpma(4,5,6);// 120.0
    }
    public static void toplama(double a, double b){ // a ve b parametre olarak adlandirilir
        System.out.println(a+b);
    }
    public static void carpma (double a, double b){
        System.out.println(a*b);
    }
    public static void carpma (int a, double b){
        System.out.println(a*b);
    }
    public static void carpma (int a, int b){
        System.out.println(a*b);
    }
    public static void carpma ( double a,double b,double c){
        System.out.println(a*b*c);
    }
}
