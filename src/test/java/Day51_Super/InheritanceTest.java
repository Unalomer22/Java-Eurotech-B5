package Day51_Super;

public class InheritanceTest {

    public static void main(String[] args) {
        System.out.println("Inheritance");

        Dog dog1 = new Dog();

       Dog dog2 = new Dog();
       // dog1.name = "Bob";
        dog1.color = "White";
        dog1.numberOfLeg = 4;

        System.out.println(dog1);

        dog2.numberOfLeg = 4;
        dog2.color = "Black";
        System.out.println(dog2);
    }

}
