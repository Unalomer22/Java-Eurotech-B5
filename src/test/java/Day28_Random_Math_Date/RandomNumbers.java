package Day28_Random_Math_Date;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        Random randomNumber = new Random();

        System.out.println(randomNumber.nextInt());
        System.out.println(randomNumber.nextDouble());
        System.out.println(randomNumber.nextFloat());
        System.out.println(randomNumber.nextBoolean());

        System.out.println(randomNumber.nextInt(10));// 0 ile 9 arası int random number
        System.out.println(randomNumber.nextInt(10) + 5); // 5 ile 14 arası int random number


    }

}
