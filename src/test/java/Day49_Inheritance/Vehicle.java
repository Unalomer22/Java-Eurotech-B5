package Day49_Inheritance;

public class Vehicle { // arac

    String name;
    double weight;
    double length;
    int seats; // koltuklar
    int lights;

    public void start(){
        System.out.println("Arac calisiyor");
    }

    public void stop(){
        System.out.println("Arac duruyor");
    }

    public void move(){ // move = hareket
        System.out.println("Arac hareket ediyor");
    }

}
