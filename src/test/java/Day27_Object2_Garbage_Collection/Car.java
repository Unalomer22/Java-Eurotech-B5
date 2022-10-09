package Day27_Object2_Garbage_Collection;

public class Car {
            // make : marka
            String make;  // String make = "BMW"; gerektigi takdirde herhang bir fielda default value taslak class ta atanabilir ve her create edilen object bu valu ile create edilir
            String model;
            int currentSpeed; // aktuel hiz
            String color;
            double price;

            public void drive() {
                System.out.println(make + " " + model + " driving.....");
            }
            public void showCurrentSpeed(int speedLimit) {
                if (currentSpeed <= speedLimit) {
                    System.out.println(make + " is driving at " + currentSpeed + " kmph, following the speed limit " + speedLimit);
                } else {
                    System.out.println(make + " is driving at " + currentSpeed + " kmph, over the speed limit " + speedLimit);
                }
            }
            // accelerate : hızlanma
            public void accelerate(int kmph) {
                currentSpeed += kmph;
            }

            public void gearChange(int gear) { // gearChange vites degiştirme

                switch (gear) {

                    case 1:
                        System.out.println("Gear 1");
                        currentSpeed = 20;
                        break;
                    case 2:
                        System.out.println("Gear 2");
                        currentSpeed = 35;
                        break;
                    case 3:
                        System.out.println("Gear 3");
                        currentSpeed = 50;
                        break;
                    case 4:
                        System.out.println("Gear 4");
                        currentSpeed = 70;
                        break;
                    case 5:
                        System.out.println("Gear 5");
                        currentSpeed = 90;
                        break;
                    case 6:
                        System.out.println("Gear 6");
                        currentSpeed = 120;
                        break;
                    default:
                        System.out.println("Invalid Gear");
                }
            }

                public void gearChange(String gear) {
                    switch (gear) {

                        case "R":
                            currentSpeed = -10;
                            System.out.println("Gear R");
                            break;
                        default:
                            System.out.println("Invalid Gear");
                    }
                }

                public void showPrice() {

                    switch (make) {

                        case "BMW":
                            price = 50000;
                            break;
                        case "Mercedes":
                            price = 60000;
                            break;
                        case "Ferrari":
                            price = 150000;
                            break;
                        case "Ford":
                            price = 35000;
                            break;
                        case "Sahin":
                            price = 45000;
                            break;
                        default:
                            System.out.println("Invalid Car Make");
                    }
                }

            public void printCarInfo() {
                System.out.println("Car make[" + make + "], model[" + model + "], color[" + color + "], current speed[" + currentSpeed + "]");
            }
        }



