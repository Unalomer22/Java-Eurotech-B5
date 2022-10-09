package Day5;

public class MarketAlisveris {

    public static void main(String[] args) {
        int elmaFiyatKg, sutFiyatKutu, sekerFiyatKg;
        double kdvOrani = 0.18D;
        float kdvsizTutar = 0.0F;
        float toplamTutar = 0.0F;
        float kdvTutar = 0.0F;

        elmaFiyatKg = 15; // elma fiyatı kg
        sutFiyatKutu = 8;
        sekerFiyatKg = 19;

        int elmaMiktar =0 ; // Kg cinsinden
        int sutMiktar = 0; // Kutu cinsinden
        int sekerMiktar = 0; //Kg cinsinden

        //alışveriş yapalım
        /*
            Sepette:
            5 Kg Elma
            2 Adet kutu süt
            3 Kg Seker
        */

        elmaMiktar = 5;
        sutMiktar = 2;
        sekerMiktar = 3;

        kdvsizTutar = (elmaMiktar * elmaFiyatKg) + (sutMiktar * sutFiyatKutu) + (sekerMiktar * sekerFiyatKg);
        kdvTutar = kdvsizTutar * 0.18F;
        toplamTutar = kdvsizTutar + kdvTutar;

        System.out.println("KDV'siz toplam tutar = " + kdvsizTutar);
        System.out.println("Kdv Tutarı = " + kdvTutar);
        System.out.println("TOPLAM TUTAR = " + toplamTutar );

    }

}
