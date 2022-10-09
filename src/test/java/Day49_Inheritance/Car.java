package Day49_Inheritance;

public class Car extends Vehicle{
    double tireSize;// lastik boyutu
    String brand;// marka
    int doorNumber;// kapi numarasi

    public void honk(){ // honk = korna calmak

        System.out.println("Araba korna caliyor");
    }

    public void handBreak(){ // el freni
        System.out.println("---");
    }

    public void opentrunk(){ // acik gövde
        System.out.println("----");
    }
}
