package Day60_Polymorphism2;

public class Parent {
    public void m1(){}
}

interface MyInterface{

    public abstract void m2();
}
class ChildA extends Parent implements MyInterface {

    public void m2(){}

    public void m3(){}
}
class ChildB extends Parent implements MyInterface {

    public void m2(){}

    public void m4(){}
}

class TestMethod{
    public static void main(String[] args) {
        ChildA childA = new ChildA();
        childA.m1();
        childA.m2();
        childA.m3();

        ChildB childB = new ChildB();
        childB.m1();
        childB.m2();
        childB.m4();

        Parent p1 = new ChildA();
        p1.m1();

        Parent p2 = new ChildB();
        p2.m1();

        MyInterface my1 = new ChildA();
        my1.m2();

        MyInterface my2 = new ChildB();
        my2.m2();
    }
}