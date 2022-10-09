package Day28_Garbage_Colection2;

public class DogObject {

    public static void main( String [] args) {

        // Garbage Collection icin objecti unreferenced yapmanın iki yolu vardır.

        // 1. Yol null yaparak
        Dog dog1 = new Dog();

        System.out.println("dog1 = " + dog1);// dog1 = Dog@38082d64

        dog1 = null;

        System.out.println("dog1 = " + dog1);// dog1 = null

        // 2. yol objecti bir diger objecte reference ederek

        Dog dog2 = new Dog();
        System.out.println("dog2 = " + dog2);

        Dog dog3 = new Dog();
        System.out.println("dog3 = " + dog3);

        dog2 = dog3;
        System.out.println("dog2 = " + dog2); // dog2 = Dog@42d3bd8b
        System.out.println("dog3 = " + dog3);//  dog3 = Dog@42d3bd8b

    }

}
