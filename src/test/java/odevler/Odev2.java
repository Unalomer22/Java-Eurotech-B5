package odevler;

public class Odev2 {
    public static void main(String[] args) {

// Odev2: Write a program that calculates the sale price of an item which is regulary priced at $£155, with a 20% discount on it. Print all values in the console
// 100 lira normal fiyat 100 liranin %20 indirimli hali 100*0,8 ---- 100 liranin %20 sini bul 100 liradan, 100 liranin %20 sini cikart ve indirilimli fizati o sekilde bul
        double normalFiyat = 155;
        double indirimFiyatiYuzde = 20;

        double indirimliFiyat = normalFiyat * (100 - indirimFiyatiYuzde) / 100;

        System.out.println("indirimliFiyat : " + indirimliFiyat);
        System.out.println("normalFiyat : " + normalFiyat);
        // 2.yol
        double indirimMiktari = normalFiyat * indirimFiyatiYuzde / 100;

        double indirimliFiyat2 = normalFiyat - indirimMiktari;
        System.out.println(indirimliFiyat2);

    }

}
