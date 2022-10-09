package Day27_Object2_Garbage_Collection;

public class Car_Object {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.printCarInfo();

        car1.make = "Ford";
        car1.model = "Fiesta";
        car1.color = "Red";
        car1.currentSpeed = 45;

        car1.printCarInfo();

        car1.drive();

        car1.showCurrentSpeed(50);

        car1.accelerate(30);

        car1.showCurrentSpeed(50);

        car1.gearChange(6);

        car1.printCarInfo();

        car1.gearChange(4);

        car1.printCarInfo();

        car1.gearChange("R");

        car1.printCarInfo();

        System.out.println("car1.price = " + car1.price);

        car1.showPrice();

        System.out.println("car1.price = " + car1.price);

    }
}


