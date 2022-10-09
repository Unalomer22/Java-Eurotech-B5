package Day56_Abstraction;

public class AbstractionClassEmployeeProg {

    public static void main(String[] args) {

        KadroluCalisan calisan1 = new KadroluCalisan();
        calisan1.firstName = "Ahmet";
        calisan1.lastName = "Falanca";
        calisan1.yillikMaas = 45000;
        calisan1.id = 125;

        System.out.println("Kadro ücretli calisan");
        System.out.println(calisan1.tamAdi());
        System.out.println("AylikMaas() = " + calisan1.aylikMaas());

        System.out.println("Saat ücretli calisan");
        SaatlikCalisan saatlikCalisan = new SaatlikCalisan();
        saatlikCalisan.id = 234;
        saatlikCalisan.firstName = "Ali";
        saatlikCalisan.ikinciAd = "Veli";
        saatlikCalisan.lastName = "Saat";
        saatlikCalisan.saatUcreti = 12;
        saatlikCalisan.toplamCalismaSaati = 125;

        System.out.println("saatlikCalisan.tamAdi() = " + saatlikCalisan.tamAdi());
        System.out.println("saatlikCalisan.aylikMaas() = " + saatlikCalisan.aylikMaas());

    }



}
