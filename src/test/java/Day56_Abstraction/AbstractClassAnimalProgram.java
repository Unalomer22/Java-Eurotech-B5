package Day56_Abstraction;

public class AbstractClassAnimalProgram {
    public static void main(String[] args) {
        System.out.println("Abstract Class and Method in Java.");

        Dog boby = new Dog();
        boby.name = "Boby";
        boby.color = "Black";
        System.out.println(boby.printInfo());

        boby.createSound();
        boby.sleep();

        Cat mahur = new Cat();
        mahur.name = "Mahur";
        mahur.color = "Gray";

        System.out.println(mahur.printInfo());
        mahur.sleep();
        mahur.createSound();

       /* Animal animal1 = new Animal(); // From an Abstract class not be create an object
        animal1.color = "Beyaz";
        animal1.name = "Herhangi bir hayvan";

        System.out.println(animal1.printInfo());
        animal1.createSound();
        animal1.sleep();

*/

    }
}
