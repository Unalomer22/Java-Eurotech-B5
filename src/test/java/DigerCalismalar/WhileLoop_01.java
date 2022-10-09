package DigerCalismalar;

public class WhileLoop_01 {
    public static void main(String[] args) {

        /*
        3 basamakli 4 ve 6 ya tam bolunebilen tam sayıları buyukten kucuge ekrana yazdırın
        Bu sayıların kac tane oldugunu ekrana yazdırın
         */
        int i = 999;
        int counter=0; // sayac, flag = bayrak demek
        while (i >= 100) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                counter++;
            }
            i--;
        }
        System.out.println();
        System.out.println("4 ve 6 ya bolunen " + counter + " tane sayı vardır");
    }
}