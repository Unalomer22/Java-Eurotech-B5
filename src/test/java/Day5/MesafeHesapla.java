package Day5;

public class MesafeHesapla {

    public static void main(String[] args) {
        /*
            Gidilen mesafe hesaplama algoritması.
            1-Hız değerini oku
            2-Zaman değerini oku
            3-Zaman ve Hız'i çarp (mesafe = Hiz * Zaman)
            4-Mesafeyi ekrana yaz
        */
        int speedKm, timeHr, distanceKm;
        speedKm = 60;
        timeHr = 12;
        //distanceKm  = 0;

        distanceKm   = speedKm * timeHr;

        System.out.println("Arabanın hızı(Km) = " + speedKm);
        System.out.println("Gidilen süre(Saat) = " + timeHr);
        System.out.println("Toplam katedilen mesafe(km) = " + distanceKm);

    }


}
