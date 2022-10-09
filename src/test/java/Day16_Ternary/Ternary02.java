package Day16_Ternary;

public class Ternary02 {
    public static void main(String[] args) {

        int number = 24;

        // 1. YOL ( If ile)
        if (number>0){
            System.out.println("Positive Number");
        }
        else {
            System.out.println(" Negative Number");
        }

        // 2. YOL ( Ternary ile )

        String result = ( number >0) ? "Positive Number" : "Negative Number";
        System.out.println(result);

        System.out.println("************************************");

        int score = 65;
        String str = (score>60) ? " You passed the exam" : " You failed the exam";

        System.out.println(str);

        System.out.println("*************************************");

        int age = 18;

        String isEligible = ( age >= 18) ? " User is eligible to vote" : "User is not eligible to vote" ;
        System.out.println(isEligible);



    }
}
