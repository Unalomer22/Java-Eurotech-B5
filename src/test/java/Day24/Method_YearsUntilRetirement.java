package Day24;

import java.util.Scanner;

public class Method_YearsUntilRetirement {

    public static int calculateAge(int dogumYili){
        int buYil = 2022;
        int age= 0;
        age = buYil- dogumYili;
        return age;
    }
    public static void yearsUntilRetirement (String ad, int yas){
        int emeklilikYasi = 65;
        int emekliligeKalanSüre= emeklilikYasi-yas;
        System.out.println(ad + " retires in " + emekliligeKalanSüre + " years ");
}
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen adınızı gırınız");
        String ad = input.nextLine();

        System.out.println("Lutfen dogum yılınızı gırınız");
        int dogYil= input.nextInt();

        System.out.println("Emeklılıge kalan sure hesabı");
        int yas = calculateAge(dogYil);

        yearsUntilRetirement(ad, yas);
        yearsUntilRetirement(ad,calculateAge(dogYil));
        System.out.println(calculateAge(1990));
        yearsUntilRetirement("Ahmet",32); // Alttaki ıle aynı sonucu verır
        yearsUntilRetirement("Ahmet", calculateAge(1990));// Usttekı ıle aynı sonucu verır
    }
}
