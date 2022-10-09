package Day30;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Random rastgeleSayi = new Random();

        System.out.println("rastgeleSayi.nextInt() = " + rastgeleSayi.nextInt());// Tum int degerler icinden sayi uretir
        System.out.println("rastgeleSayi.nextInt(10) = " + rastgeleSayi.nextInt(10)); // 10 a kadar bir sayi uretir. 0 dahil 10 arasi
        // System.out.println("rastgeleSayi.nextInt(max) = " + rastgeleSayi.nextInt(max)); // Bu max kodu calismadi !!!!!!!!!!!!
        System.out.println("rastgeleSayi.nextDouble() = " + rastgeleSayi.nextDouble());// 0 ile 1 arasi sayi uretir
        System.out.println("rastgeleSayi.nextBoolean() = " + rastgeleSayi.nextBoolean()); // true ya da false uretir

        int low = 50;
        int high = 100;
        int result = rastgeleSayi.nextInt(high-low) + low;

        System.out.println("result = " + result);
    }
}
