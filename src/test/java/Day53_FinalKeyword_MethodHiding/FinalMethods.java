package Day53_FinalKeyword_MethodHiding;

public class FinalMethods {
    public final void method1(){
        System.out.println("Method-1");
    }

    public static void staticMethod(){
        System.out.println("Static Method");
    }
}

class Sub extends FinalMethods{

    /*
    public void method1(){
        System.out.println("Method-1 in sub class");
    }
     */

    public static void staticMethod(){
        System.out.println("Static Method in sub class");
    }
}

