package Day14_Switch;

import java.util.Scanner;

public class Switch03_HaftaninGunleri {
    public static void main(String[] args) {

        System.out.println("Haftanın günleri");

        Scanner gunGiris = new Scanner(System.in);

        int gun=1;

        System.out.println("Klavyeden bir gün için sayı giriniz (1-7)...: ");
        gun = gunGiris.nextInt();

        switch (gun){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geçersiz bir gün girdiniz!");
        }

    }

}
