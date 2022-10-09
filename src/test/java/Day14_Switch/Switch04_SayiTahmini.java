package Day14_Switch;

import java.util.Scanner;

public class Switch04_SayiTahmini {
    public static void main(String[] args) {

        System.out.println("Sayı tahmin");

        Scanner tahminGir = new Scanner(System.in);

        int randomNum = (int)(Math.random() * 2 + 1);
        int ustSinir=2;
        int tahmin;

        randomNum = (int)(Math.random() * ustSinir + 1);
        //System.out.println("Rastgele sayı...: " +  randomNum);
        System.out.println("Tahminmiz nedir? ");
        tahmin = tahminGir.nextInt();

        if (randomNum ==tahmin){
            System.out.println("Tebrikler sayıyı bildiniz!!!");
            System.out.println("Tuttuğum sayı " + randomNum);
        }else System.out.println("Malesef bilemediniz!!");















    }
}
