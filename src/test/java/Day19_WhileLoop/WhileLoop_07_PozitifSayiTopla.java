package Day19_WhileLoop;

import java.util.Scanner;

public class WhileLoop_07_PozitifSayiTopla {
    public static void main(String[] args) {
        System.out.println(" Klavyeden girilen positif sayilarin toplamini ekrana yazan program");
        System.out.println("Klavyeden sıfır veya sıfırdan küçük bir sayı girerek programı sonlandırabilirsiniz.");
        Scanner klavyeGir = new Scanner(System.in);
        int toplam = 0;
        int aratoplamSayisi = 1;

        System.out.print("Klavyeden sıfırdan büyük bir sayı giriniz..: ");
        int sayi = klavyeGir.nextInt();

        while (sayi > 0){
            toplam = toplam + sayi;
            if (aratoplamSayisi %5==0)
            {
                System.out.println("Ara toplam...: " + toplam);
            }
            System.out.print("Klavyeden sıfırdan büyük bir sayı giriniz..: ");
           sayi = klavyeGir.nextInt();
           aratoplamSayisi++;
        }
        System.out.println("toplam = " + toplam);
    }
}


