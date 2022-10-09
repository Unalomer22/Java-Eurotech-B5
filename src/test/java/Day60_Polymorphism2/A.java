package Day60_Polymorphism2;

public class A {

    public int methodA(){
        System.out.println("Method A");
        return 3+4;
    }
}
class B extends A{
    public void methodB(){
        System.out.println("Method B");
    }
}
class C extends B{
    public void methodC(){
        System.out.println("Method C");
    }
}
class Test{
    public static void main(String[] args) {

        A obj = new B();
        //System.out.println(obj.methodA()); // MethodA alt satira 3+4
        obj.methodA();//
/*
        B obj2= (B) obj;// B obj2 = new B();
        obj2.methodB();

        A obj3 = new C();
        obj3.methodA();

        B obj4 = (C) obj3;
        obj4.methodA();
        obj4.methodB();

        C obj5 = (C) obj4;
        obj5.methodA();
        obj5.methodB();
        obj5.methodC();


        // Can not be casted beliw class level
        A obj6 = new B();
        C obj7 = (C) obj6;
        obj7.methodC();
        obj7.methodB();
        obj7.methodA();


        A
        B
        C
        D

        A obj = new D();
        Casting level : B,C,D

        A obj = new C();
        Casting level : B,C
        Not casting to D
         */
    }
}