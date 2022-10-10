package Day59_Polymorphism;

public class Animal {
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Dog says : Hav Hav");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("Cat says : Miyav miyav");
    }
}
class Duck extends Animal{
    public void sound(){
        System.out.println("Duck says : Vak Vak");
    }
}
class Test{
    public static void main(String[] args) {

        // Non- Polymorphic way of object creation
        Animal animal = new Animal();
        animal.sound();// Animal makes a sound
        Dog dog = new Dog();
        dog.sound();// Dog says : Hav Hav
        Cat cat = new Cat();
        cat.sound();// Cat says : Miyav miyav
        Duck duck = new Duck();
        duck.sound();// Duck says : Vak Vak

        System.out.println("----------------");
        //  // Polymorphic way of object creation
        Animal dog1 = new Dog();
        dog1.sound();// Dog says : Hav Hav

        Animal cat1 = new Cat();
        cat1.sound();// Cat says : Miyav miyav

        Animal duck1 = new Duck();
        duck1.sound();// Duck says : Vak Vak

        Animal animal1 = new Animal();
        animal1.sound();// Animal makes a sound


    // Same object name,same method but different behavior
        animal1 = new Dog();
        animal1.sound();// Dog says : Hav Hav
        animal1 = new Cat();
        animal1.sound();// Cat says : Miyav miyav
        animal1 = new Duck();
        animal1.sound();// Duck says : Vak Vak

    }



}