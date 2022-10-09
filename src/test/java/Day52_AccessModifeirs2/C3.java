package Day52_AccessModifeirs2;

import Day52_AccessModifiers.C1;

public class C3 extends C1 {

    public static void main(String[] args) {

        C1 obj3 = new C1();
       // obj3.test(); Can not access protected method from parent class
        // // Baska bir package da bulunan protected method a diger package dan super class tan olusturulan object ile ulasim mümkün degil
        C3 obj4 = new C3();
        obj4.test();// Can access protected method from child class in outside of package
                    // Baska bir package da bulunan protected method a diger package daki sub class tan olusturulan object ile ulasim mümkün
    }
}
