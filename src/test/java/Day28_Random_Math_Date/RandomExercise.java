package Day28_Random_Math_Date;

import java.util.Random;

public class RandomExercise {
    public static void main(String[] args) {

     // Write code that generates a random odd integer ( not divisible by 2) between 50 and 99 inclusive
        // Random olarak verilen 50 ile 100 sayıları arasından ekrana sadece tek sayıları yazdırsın.
        Random random = new Random();

        int value;

        while (true) {
            value = random.nextInt(100 - 50) + 50;

            if (value % 2 != 0) {
                break;
            }
        }
        System.out.println("value = " + value);
    }
}
