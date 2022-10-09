package Day49_Inheritance;

public class Runner {

    public static void main(String[] args) {

      Animal a1 = new Animal();
      a1.hareket();// Hareket eder
      a1.yeme();// Yemek yerler.
      a1.icme();// Su icerler.

        System.out.println("============================");

        Mammal m1 = new Mammal();
        m1.sutIleBesle();// Yavrularini sütle beslerler
        m1.dogum();// Dogum yaparlar.
        m1.hareket();// Hareket eder
        m1.yeme();// Yemek yerler.
        m1.icme();// Su icerler.

        System.out.println("=============================");

        Cat c1 = new Cat();
        c1.miyav();// Miyavlarlar.
        c1.sutIleBesle();// Yavrularini sütle beslerler
        c1.dogum();// Dogum yaparlar.
        c1.hareket();// Hareket eder
        c1.yeme();// Yemek yerler.
        c1.icme();// Su icerler.

        System.out.println("=============================");

        Dog d1 = new Dog();
        d1.havla();// Havlarlar.
        d1.sutIleBesle();// Yavrularini sütle beslerler
        d1.dogum();// Dogum yaparlar.
        d1.hareket();// Hareket eder
        d1.yeme();// Yemek yerler.
        d1.icme();// Su icerler.

        System.out.println("=============================");

        Fisch f1 = new Fisch();
        f1.yumurtla();// Yumurtlarlar.
        f1.hareket();// Hareket eder
        f1.yeme();// Yemek yerler.
        f1.icme();// Su icerler.

    }
}
