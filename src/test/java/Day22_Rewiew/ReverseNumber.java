package Day22_Rewiew;

public class ReverseNumber {
    public static void main(String[] args) {

        // Reverse a number by usıng while loop
        // 458443 ==> 344854

        int number = 458443;
        int reversedNumber = 0;

        while (number !=0){
            int digit = number%10;
            reversedNumber = reversedNumber* 10 + digit;
            number = number/10;
        }
        System.out.println("reversedNumber = " + reversedNumber);

    }
}
