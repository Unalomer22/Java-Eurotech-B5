package Day29;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter any number between 1-999 : ");
        int number = scan.nextInt();

        // number = 981 sample test value (result = sonuc demek)
        int result = number % 10;// result = 1

        number = number / 10; // 981 / 10 = 98

        result = result + number % 10; // result = 1 + 8

        number  = number / 10; // number 9

        result = result + number; // 1+8+9
        // if result is negative convert in to positive
        if(result<0){
            result = result * -1;
        }

        System.out.println("results = " + result);
    }
}
