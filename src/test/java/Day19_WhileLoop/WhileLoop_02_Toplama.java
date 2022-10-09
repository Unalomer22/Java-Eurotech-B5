package Day19_WhileLoop;

public class WhileLoop_02_Toplama {
    public static void main(String[] args) {
        System.out.println(" While Loop Sayi Toplama...");
        int sum= 0;
        int i = 1;
        while ( i<10){
        sum = sum + i;// sum +=i
            System.out.println("i = " + i);
            System.out.println("sum = " + sum);
        i++;

        }// while sonu

        System.out.println( " sum = " + sum);






    }
}
