package Day47;

public class OgrenciTest {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();
        Ogrenci ogr2 = new Ogrenci();

        Ogrenci ogr3 = new Ogrenci("Ali");

        //ogr1.ogrNumber = 15;
        ogr1.ad = "Ahmet";
        ogr1.soyad = "Falanca";

      //  ogr2.ogrNumber = 15;
        ogr2.ad = "Jon";
        ogr2.soyad = "Smith";

        System.out.println("ogr1.toString() = " + ogr1);
        System.out.println("ogr2.toString() = " + ogr2);
        System.out.println("ogr3.toString() = " + ogr3);

    }
}
