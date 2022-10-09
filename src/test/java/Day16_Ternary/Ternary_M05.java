package Day16_Ternary;

import java.util.Scanner;

public class Ternary_M05 {
    public static void main(String[] args) {
        //Kullanicidan bir tamsayi alin ve sayi 10’dan kucukse “Rakam veya negatif sayi” , 100’den
        //kucukse “iki basamakli sayi”degilse “uc basamakli veya daha buyuk sayi” yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println(" Lutfen bir tam sayi degeri giriniz");

        int tamsayi = scan.nextInt();

        System.out.println( tamsayi < 10 ? " Rakam veya negatif sayi" : (tamsayi < 100 ? " Iki basamakli sayi " : "Uc basamakli veya daha buyuk sayi"));

scan.close();


    }
}
