package Day42_Rewiew;

public class OtoparkProgram {
    public static void main(String[] args) {
        Otopark otopark1 = new Otopark();

        otopark1.name = "ABC otoparki";
        otopark1.adress = "Falanca yerdeki otopark no=12";
        otopark1.capacity = 100;

        Araba araba1 = new Araba();

        araba1.marka = "Honda";
        araba1.plateNumber = "06ABC007";

        Araba araba2 = new Araba();

        araba2.marka = "Audi";
        araba2.plateNumber = "FAA345";

        Araba araba3 = new Araba();
        araba3.marka = "BMW";
        araba3.plateNumber = "ABC123";

        otopark1.bosAracKapasite();// Otoparkta 100 araclik bos alan var.
        otopark1.otoparkaGiris(araba1);// Honda otoparka giris yapti
        otopark1.otoparkaGiris(araba2);// Audi otoparka giris yapti
        otopark1.otoparkaGiris(araba3);// BMW otoparka giris yapti

        otopark1.otoparkAracListe();// Arabanin markasi Honda,  plakasi 06ABC007
                                    // Arabanin markasi Audi,  plakasi FAA345

        otopark1.bosAracKapasite();// Otoparkta 97 araclik bos alan var.

        otopark1.otoparkCikis(araba1);// Honda otoparktan cikis yapti
        otopark1.otoparkAracListe();

        otopark1.bosAracKapasite();// Otoparkta 98 araclik bos alan var.
        otopark1.otoparkaGiris(araba3);// Bu plakali arac otoparkta var. Bu yuzden giris yapamazsiniz!. Ayni arabayi iki kez yazdirmadi
        otopark1.otoparkAracListe();
        otopark1.bosAracKapasite();// Otoparkta 98 araclik bos alan var.

        otopark1.searchByPlateNumber("FAA345");// Araba{name='Audi', plateNumber='FAA345'}
    }










}
