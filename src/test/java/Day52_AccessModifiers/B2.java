package Day52_AccessModifiers;

public class B2 {
    public static void main(String[] args) {

        B1 obj = new B1();// Cann access default class inside of the package

        System.out.println(obj.i);
        obj.test();
    }
}
