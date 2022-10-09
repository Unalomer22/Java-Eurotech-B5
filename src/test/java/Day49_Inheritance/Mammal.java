package Day49_Inheritance;

public class Mammal extends Animal{

    public Mammal(){
        System.out.println("Mammal parametresiz conctructor");
    }
    public void sutIleBesle(){
        System.out.println("Yavrularini sütle beslerler");
    }
    public void dogum(){
        System.out.println("Dogum yaparlar.");
    }

}
