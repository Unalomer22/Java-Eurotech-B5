package Day45;

public class DikdortgenTest {

    public static void main(String[] args) {
        //Parametreli constructor kullanilarak obje uretilmesi
        Dikdortgen dikdortgen1 = new Dikdortgen(7, 10);

        //Parametresiz constructor kullanilarak obje uretilmesi ve degerlerinin setter methodlar kullanilarak atanmasi
        Dikdortgen dikdortgen2 = new Dikdortgen();
        dikdortgen2.setBoy(13);
        dikdortgen2.setEn(5);

        System.out.println(dikdortgen1.getBoy());
        System.out.println(dikdortgen1.getEn());

        System.out.println(dikdortgen2.getBoy());
        System.out.println(dikdortgen2.getEn());

        System.out.println("1.Dikdortgenin alani = " + dikdortgen1.getBoy() * dikdortgen1.getEn());
        System.out.println("2.Dikdortgenin alani = " + dikdortgen2.getBoy() * dikdortgen2.getEn());


        dikdortgen1.setBoy(20);
        dikdortgen1.setEn(5);

        System.out.println(" Degerler degisti");

        dikdortgen2.setBoy(30);
        dikdortgen2.setEn(4);

        System.out.println("1.Dikdortgenin yeni boyu =" + dikdortgen1.getBoy());
        System.out.println("1.Dikdortgenin yeni eni = " + dikdortgen1.getEn());

        System.out.println("2.Dikdortrgenin yeni boyu = " + dikdortgen2.getBoy());
        System.out.println("2.Dikdortgenin yeni eni = " + dikdortgen2.getEn());

        System.out.println("1.Dikdortgenin yeni alani = " + dikdortgen1.getBoy() * dikdortgen1.getEn());
        System.out.println("2.Dikdortgenin yeni alani = " + dikdortgen2.getBoy() * dikdortgen2.getEn());

    }
}
