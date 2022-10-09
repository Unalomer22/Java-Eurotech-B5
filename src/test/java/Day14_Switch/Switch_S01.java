package Day14_Switch;

import java.util.Scanner;

public class Switch_S01 {

    public static void main(String[] args) {

// Kullanici hafta gununun sayisini girsin ,program haftanin gununu yazsin.
        Scanner scan= new Scanner(System.in);
        System.out.println(" Ismini gormek istediginiz gun sayisini giriniz");
        int gun = scan.nextInt();
// 1. yol
        if (gun==1){
            System.out.println("Pazartesi");
        }else if (gun==2){
            System.out.println("Sali");
        }else if (gun==3) {
            System.out.println("Carsamba");
        }else if (gun==4) {
            System.out.println("Persembe");
        }else if (gun==5) {
            System.out.println("Cuma");
        }else if (gun==6) {
            System.out.println("Cumartesi");
        }else if (gun==7) {
            System.out.println("Pazar");
        } else {
            System.out.println(" Gecerli gun sayisini giriniz");
        }

        // 2.yol Switch
        switch (gun){
            case 1:
                System.out.println(" Pazartesi");
                break;
            case 2:
                System.out.println(" Sali");
                break;
            case 3:
                System.out.println(" Carsamba");
                break;
            case 4:
                System.out.println(" Persembe");
                break;
            case 5:
                System.out.println(" Cuma");
                break;
            case 6:
                System.out.println(" Cumartesi");
                break;
            case 7:
                System.out.println(" Pazar");
                break;
            default:
                System.out.println(" Gecerli gun sayisi giriniz");
        }



    }
}
