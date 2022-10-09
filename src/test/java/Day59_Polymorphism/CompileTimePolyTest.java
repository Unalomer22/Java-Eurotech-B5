package Day59_Polymorphism;

public class CompileTimePolyTest {
    public static void main(String[] args) {
        // Compile - time (Static) Polomorphism
        System.out.println(CompileTimePoly.Multiply(2,3));// 6
        System.out.println(CompileTimePoly.Multiply(2,3,4));// 24
        System.out.println(CompileTimePoly.Multiply(2.0,3.5));// 7.0


    }
}
