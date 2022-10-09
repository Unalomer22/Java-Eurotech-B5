package Day12_SelectionStatements;

public class IfElseStatement04 {
    public static void main(String[] args) {
        int num1= 11;
        int num2= 1;
        int num3= 33;

        if(num1> num2 && num1>num3 ){
            System.out.println("The max number is : num1" + num1);
        }

        if (num2 > num1 && num2>num3){
            System.out.println("The max number is : num2" + num2);
        }
        if (num3 > num1 && num3>num2){
            System.out.println("The max number is : num3" + num3);
        }
    }
}
