package Day16_Ternary;

public class Ternary05_Nested {
    public static void main(String[] args) {

        int x = 4 ;

        if (x>2){
            if (x<5){
                System.out.println(10);
            } else {
                System.out.println(7);
            }
        } else {
            System.out.println(5);
        }
        // Ternary Nested metodu ile
        int number = (x>2) ? ( (x<5) ? 10 : 7) : 5 ;
        System.out.println(number);
        // Islemlerdeki tum parantezleri kaldirdigimizda da islem dogru okuyor
        int number1 = x>2 ? x<5 ? 10 : 7 : 5 ;
        System.out.println(number1);

        System.out.println("****************************");

        int n1 = 10;
        int n2 = 5;

        int larger = (n1 > n2) ? n1 : n2;
        System.out.println("larger = " + larger);

        int num1 = 50;
        int num2 = 60;
        int num3 = 30;

        int largest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println("largest = " + largest);

    }
}
