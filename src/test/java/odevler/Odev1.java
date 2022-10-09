package odevler;

public class Odev1 {

// Odev1: Write a program that calculates the amount of pay will be contributed to a retirement plan if 5%, 8% or 10% of monthly pay is withheld
// 3 ayri oranda AKA 5, 8, 10 oranlarindaki kesinti ile aylik yillik ve omurluk katki miktarlarini hesaplayiniz.
public static void main ( String [] args) {

    double aylikMaas = 3000;
    double kesintiOrani1 = 5;
    double kesintiOrani2 = 8;
    double kesintiOrani3 = 10;
    double emeklilikYili= 45;

    double aylikKatkiMiktari =  aylikMaas * kesintiOrani1 / 100;
    double yillikKatkiMiktari =  aylikMaas * kesintiOrani1 / 100 * 12;
    double omurlukKatkiMiktari =  aylikMaas * kesintiOrani1 / 100 * 12 * emeklilikYili;

    double aylikKatkiMiktari2 =  aylikMaas * kesintiOrani2 / 100;
    double yillikKatkiMiktari2 =  aylikMaas * kesintiOrani2 / 100 * 12;
    double omurlukKatkiMiktari2 =  aylikMaas * kesintiOrani2 / 100 * 12 * emeklilikYili;

    double aylikKatkiMiktari3 =  aylikMaas * kesintiOrani3 / 100;
    double yillikKatkiMiktari3 =  aylikMaas * kesintiOrani3 / 100 * 12;
    double omurlukKatkiMiktari3 =  aylikMaas * kesintiOrani3 / 100 * 12 * emeklilikYili;

    System.out.println("aylikKatkiMiktari : " + aylikKatkiMiktari);
    System.out.println("yillikKatkiMiktari : " + yillikKatkiMiktari);
    System.out.println("omurlukKatkiMiktari : " + omurlukKatkiMiktari);
    System.out.println("----------------------------------------------------");
    System.out.println("aylikKatkiMiktari2 : " + aylikKatkiMiktari2);
    System.out.println("yillikKatkiMiktari2 : " + yillikKatkiMiktari2);
    System.out.println("omurlukKatkiMiktari2 : " + omurlukKatkiMiktari2);
    System.out.println("----------------------------------------------------");
    System.out.println("aylikKatkiMiktari3 : " + aylikKatkiMiktari3);
    System.out.println("yillikKatkiMiktari3 : " + yillikKatkiMiktari3);
    System.out.println("omurlukKatkiMiktari3 : " + omurlukKatkiMiktari3);

}

}
