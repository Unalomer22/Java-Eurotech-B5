package Day25_Object_Class;

import Day25_Object_Class.Dog2;

public class DogObject2 {

        public static void main(String[] args) {

            // Garbage Colection icin objecti unreferenced yapmanin 2 yolu vardir

            // 1. Yol null yaparak
            Dog2 dog1 = new Dog2();
            System.out.println("dog1 = " + dog1); //dog1=Dog@7a81197d

            dog1 = null;
            System.out.println("dog1 = " + dog1); //dog1=null

            //2. Yol objecti bir diger objecte reference ederek

            Dog2 dog2 = new Dog2();
            System.out.println("dog2 = " + dog2); // dog2=Dog@5ca881b5

            Dog2 dog3 = new Dog2();
            System.out.println("dog3 = " + dog3); // dog3=Dog@24d46ca6

            dog2 = dog3;

            System.out.println("dog2 = " + dog2); // dog2=Dog@24d46ca6
            System.out.println("dog3 = " + dog3); // dog3=Dog@24d46ca6

        }
    }

