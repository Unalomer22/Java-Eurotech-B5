package Day55_Composition;

import Day46.Box;
import Day49_Inheritance.Mammal;

public class BilgisayarTest {

    public static void main(String[] args) {

        Boyut boyut = new Boyut(35,15,30);

        Kasa kasa = new Kasa("Nirvana","Dell","Elektrik",boyut);

        Monitor monitor = new Monitor("Huwai","LG",22,new Cozunurluk(25,20));

        Anakart anakart = new Anakart("S232","Philips",2,3,"v2.12");

        Bilgisayar bilgisayar = new Bilgisayar(anakart,monitor,kasa);

        bilgisayar.getAnakart().programYükle("word");
    }

}
