package Day17_ForLoop;

import java.util.Scanner;

public class ForLoop_SayiTahmin {
        public static void main(String[] args) {

            System.out.println("Sayı tahmin");

            Scanner tahminGir = new Scanner(System.in);

            int randomNum;
            int ustSinir = 100;
            int tahmin;

            System.out.println("1 ile " + ustSinir + " arasında sayı tahmin oyunu");

            randomNum = (int)(Math.random() * ustSinir + 1);

            //System.out.println("Rastgele sayı...: " +  randomNum);
            //System.out.println("randomNum = " + randomNum);

            for (int i = 1; i <= 10; i++) {

                System.out.print( i + "-Tahmininiz nedir? ");
                tahmin = tahminGir.nextInt();

                if (randomNum == tahmin){
                    System.out.println("Tebrikler sayıyı bildiniz!!!");
                    // System.out.println("Tuttuğum sayı " + randomNum);
                    System.out.println( i + "-tahminde bildiniz");
                    break;

                }else {
                    System.out.println("Malesef bilemediniz!!");
                    if(tahmin > randomNum){
                        System.out.println("Tuttuğum sayı senin sayından küçük!");
                    }else {
                        System.out.println("Tuttuğum sayı senin sayından büyük!");
                    }
                }

            }

        }

}
