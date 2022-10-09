package Day59_Polymorphism;

public class CompileTimePoly {

    public static int Multiply(int a,int b){
        return a * b;
    }
    public static int Multiply(int a,int b, int c){
        return a * b * c;
    }
    public static double Multiply(double a,double b){
        return a * b;
    }


}
