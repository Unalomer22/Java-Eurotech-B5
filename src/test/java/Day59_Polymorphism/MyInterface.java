package Day59_Polymorphism;

public interface MyInterface {

    void show();
}
class ClassA implements MyInterface{
   public void show(){
        System.out.println("ClassA shows");
    }
}
class ClassB implements MyInterface{
    public void show(){
        System.out.println("ClassB shows");
    }
}
class PolymorphismExample2{
    public static void main(String[] args) {
        // Non-Polymorphism
        ClassA classA = new ClassA();
        classA.show();
        ClassA classA1 = new ClassA();
        classA1.show();

        MyInterface classA3 = new ClassA();
        classA3.show();
        MyInterface classA2 = new ClassB();
        classA2.show();

    // Polymorphism
        ClassA classA4 = new ClassA();
        classA4.show();
        ClassA classA5 = new ClassA();
        classA5.show();


    }
}