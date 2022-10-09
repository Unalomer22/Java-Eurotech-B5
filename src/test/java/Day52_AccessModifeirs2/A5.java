package Day52_AccessModifeirs2;

import Day52_AccessModifiers.A1;
import Day52_AccessModifiers.A3;

public class A5 {

    public static void main(String[] args) {

        A1 obj = new A1();// Need to import class first if we want to create an object from a class in another package

        //obj.i; // Can not access private instance and method
        //obj.test(); // Can not access private instance and method
       //  A3 obj = new A3(); Can not create an object due to constructor being private
    }
}
