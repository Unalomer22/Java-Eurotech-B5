package Day29;

import java.util.Scanner;

public class ParaCekme {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Çekeceğiniz para miktarını giriniz..: ");
        int cekPara = input.nextInt();

        int numbersOf200 = 0;
        int numbersOf100 = 0;
        int numbersOf50 = 0;
        int numbersOf20 = 0;
        int numbersOf10 = 0;
        int numbersOf5 = 0;

        numbersOf200 = cekPara / 200;
        cekPara = cekPara % 200;

        numbersOf100 = cekPara / 100;
        cekPara = cekPara % 100;

        numbersOf50 = cekPara / 50;
        cekPara = cekPara % 50;

        numbersOf20 = cekPara / 20;
        cekPara = cekPara % 20;

        numbersOf10 = cekPara / 10;
        cekPara = cekPara % 10;

        numbersOf5 = cekPara / 5;
        cekPara = cekPara % 5;

        System.out.println("numbersOf200 = " + numbersOf200);
        System.out.println("numbersOf100 = " + numbersOf100);
        System.out.println("numbersOf50 = " + numbersOf50);
        System.out.println("numbersOf20 = " + numbersOf20);
        System.out.println("numbersOf10 = " + numbersOf10);
        System.out.println("numbersOf5 = " + numbersOf5);

        System.out.println("Ödenmesi gereken bankada kalan para miktarı = " + cekPara);

        input.close();
    }
}





