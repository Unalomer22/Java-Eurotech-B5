package Day5;

public class Variables {

    public static void main(String[] args) {
        int Sayisi = 10; // "Camel Case" Yazım kurallarına uygun değil. Değişken isimleri küçük harf ile başlamalı.
        int sayisiBirDeger = 20;
        int hiz = 35, mesafe = 68, zaman = 45;
        int yas;
        int boy;
        int kilo;
        int x, y, z, v;

        int puan = hiz;
        System.out.println("Hız = " + hiz + " Mesafe = " + mesafe + " Zaman =  " + zaman);
        System.out.println("Puan..= " + puan);
        System.out.println("Hız..: " + hiz + " km");
        System.out.println(mesafe);
        System.out.println(zaman);
        hiz = 70;
        puan = hiz;
        System.out.println("Hız..: " + hiz + " km");

        System.out.println("Puan..= " + puan);
        System.out.println("X'in değeri");
        System.out.println(Sayisi);

        Sayisi= 4;
        System.out.println("X'in sonraki değeri");
        System.out.println(Sayisi);

        yas = 34;
        System.out.print("Ahmet'in yası...:" + yas);
        // System.out.println(yas);

    }


}
