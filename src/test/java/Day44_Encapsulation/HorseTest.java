package Day44_Encapsulation;

public class HorseTest {
    public static void main(String[] args) {

       Horse horse = new Horse() ;
        //accessing the instance from everywhere// public
       horse.name = "Karayel";

       // not able to acces instance outside of the class// private
      //  horse.numberOfLegs = 5;

        horse.print();


    }
}
