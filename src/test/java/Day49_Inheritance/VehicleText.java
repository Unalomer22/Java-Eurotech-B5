package Day49_Inheritance;

public class VehicleText {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.name = "Arac ismi";
        v1.start();
        v1.move();
        v1.stop();

        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.honk();
        c1.start();
        c1.move();
        c1.stop();
        //c1.pressureCheck();

        Plane p1 = new Plane();
        p1.engineType = "Jet";
        p1.pressureCheck();
        p1.name = "Boing";
        p1.seats = 120;
        //p1.brand = "F16";


    }
}
