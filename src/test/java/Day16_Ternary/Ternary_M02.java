package Day16_Ternary;

public class Ternary_M02 {

    public static void main(String[] args) {

        int sayi = 90;

        String sonuc         =       sayi%2 ==0 ? "Sayi cift" : " Sayi tek";
   // Variable atamak veya          Sart(boolean)   true            false
   // direkt yazdirmak zorundayim

        System.out.println(sonuc);

        System.out.println("********************************");

        System.out.println( sayi>100 ? "Sayi 100 den buyuk" : 10); // direkt yazdirdigimiz zaman sonuclarin ikisi ayni cinsten olmak zorunda degil
    }
}
