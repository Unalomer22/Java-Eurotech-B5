package Day52_AccessModifiers;

public class E2 extends E1{

    public static void main(String[] args) {


    }
    // Overriding method has to be same or moore visible than overriden method

    // test() is public method and more visible then overriden one in parent class
    public void test(){
        System.out.println("Child Class");
    }

    // test2() is default method and less visible then overriden one in parent class
    /*
    void test2(){
        System.out.println("Parent Class Method");
    }
     */
}
