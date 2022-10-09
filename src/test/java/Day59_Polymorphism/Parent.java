package Day59_Polymorphism;

public class Parent {

    public void Print(){
        System.out.println("Parent Class");
    }
}
class SubClass1 extends Parent{

    public void Print(){
        System.out.println("Subclass1 Class");
    }
}
class SubClass2 extends Parent{

    public void Print(){
        System.out.println("Subclass2 Class");
    }
}
class RunTimePolyTest{
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.Print();// Parent Class

        SubClass1 subClass1 = new SubClass1();
        subClass1.Print();// Subclass1 Class

        Parent p2 = new SubClass1();
        p2.Print();// Subclass1 Class

        SubClass2 subClass2 = new SubClass2();
        subClass2.Print();// Subclass2 Class

        Parent p3 = new SubClass2();
        p3.Print();// Subclass2 Class
    }

}