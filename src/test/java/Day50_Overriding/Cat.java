package Day50_Overriding;

import Day52_AccessModifiers.A3;

public class Cat extends Animal {

    @Override // Annotation : Yapilan Overriding in Java tarafindan kontrol edilmesini istiyorsak "@Override" yazmamiz gerekir
    public void ses(){ // Overriding method
        System.out.println("Kediler miyavlar");

    }

    @Override
     protected int add() {
        return 1+2;
    }

    @Override
    public Integer multiply() {
        return 1*2;
    }

    @Override
    public Animal create() {
        return new Cat();
    }

}
