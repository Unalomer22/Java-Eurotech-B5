package Day26_Rewiew;

public class PhoneShop {

    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone();

       phone1.marka= "Iphone";
       phone1.model = " X";
       phone1.renk= "Gri";
       phone1.ekranBoyutu = 8.5;
       phone1.fiyat= 1250;


        System.out.println(" Urun bilgileri");
        System.out.println("Telefon markası: " + phone1.marka);
        System.out.println("Telefon modeli: " + phone1.model);
        System.out.println("Telefon rengi: " + phone1.renk);
        System.out.println("Telefonun ekran boyutu: " + phone1.ekranBoyutu + " inch");
        System.out.println("Telefon fiyati: " + phone1.fiyat + " $");

        phone1.arama();
        phone1.mesajAtma();
        phone1.fotografCekme();
        phone1.navigasyonaBaglanma();

    }
}
