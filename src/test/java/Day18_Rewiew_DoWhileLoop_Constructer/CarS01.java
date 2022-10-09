package Day18_Rewiew_DoWhileLoop_Constructer;

public class CarS01 {
    int price;
    int year;
    String make;// marka
    String model;
    String color;
    boolean isDiesel;
    double km;

    public CarS01(int price, int year, String make, boolean isDiesel) {
        this.price = price;// Esitligin sol tarafi Instance variable dir.
        // Esitligin sag tarafi parametre dir.
        this.year = year;
        this.make = make;
        this.isDiesel = isDiesel;
    }
    public CarS01(int price, int year, String make, String model, String color, double km, boolean isDiesel) {
        this.price = price;// Esitligin sol tarafi Instance variable dir.
        this.year = year;
        this.make = make;
        this.isDiesel = isDiesel;
        this.model = model;
        this.color = color;
        this.km = km;
    }
        public static void main (String[]args){

            CarS01 car1 = new CarS01(5000, 2018, "Toyota", true);
            System.out.println(" Arabanin ucreti : " + car1.price); // 5000
            System.out.println(" Arabanin uretim yili : " + car1.year); // 2018
            System.out.println(" Arabanin modeli : " + car1.make);// Toyota
            System.out.println(" Araba diesel mi : " + car1.isDiesel);// true

            System.out.println();

            CarS01 car2 = new CarS01(80000, 2020, "Audi", false);
            System.out.println(" Arabanin ucreti : " + car2.price); // 80000
            System.out.println(" Arabanin uretim yili : " + car2.year); // 2020
            System.out.println(" Arabanin modeli : " + car2.make);// Audi
            System.out.println(" Araba diesel mi : " + car2.isDiesel);// false

            System.out.println();

            CarS01 car3 = new CarS01(30000,2017,"BMW ","3.35i","Red",50000,false);
            System.out.println(" Arabanin ucreti : " + car3.price); // 30000
            System.out.println(" Arabanin uretim yili : " + car3.year); // 2017
            System.out.println(" Arabanin modeli : " + car3.make);// BMW
            System.out.println(" Araba diesel mi : " + car3.isDiesel);// false
            System.out.println(" Arabanin modeli : " + car3.model); // 3.35i
            System.out.println(" Arabanin rengi : " + car3.color);// Red
            System.out.println(" Arabanin km si : " + car3.km);// 50000

        }
    }