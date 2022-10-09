package Day12_SelectionStatements;

public class IfExercise4 {
    public static void main(String[] args) {
        int num1=11 , num2= 1 , num3= 33;
       if (num1<num2 && num1<num3){
           System.out.println("En kucuk sayi : num1--" + num1);
       }

        if (num2<num1 && num2<num3){
            System.out.println("En kucuk sayi : num2--" + num2);
        }
        if (num3<num1 && num3<num2){
            System.out.println("En kucuk sayi : num3--" + num3);

        }

    }
}
