package Ayse_Tekrar;

public class Ayse11 {
    public static void main(String[] args) {
       // Bir string kabul eden method yazin, method ilk 2 karakteri stringin sonuna eklesin
       // String en az iki karakterli olmali
       // Örnek: method("Hello")===> lloHe seklinde

        String str = "Hello";
        if (str.length()<2){
            System.out.println("Lutfen 2 den fazla karakter giriniz");
            return;
        }
        System.out.println(str.substring(2,str.length()) + str.substring(0,2));// lloHe
        // 2. yol
        System.out.println(str.substring(2).concat(str.substring(0, 2)));// lloHe


    }
}
