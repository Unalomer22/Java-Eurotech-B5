package Day21_Method;

public class HirerarchialMethodCall {
    public static void main(String[] args) {

        System.out.println("Main Method");
        displayMessage();
        System.out.println("Back to Main Method");
    }
    public static void displayMessage(){
        System.out.println("Hello World");
        calculation();
        System.out.println("Back to displayMessage Method");
    }
    public static void calculation(){
        System.out.println(10*5/2+1);
    }
}
