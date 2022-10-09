package Day17_ForLoop;

public class ForLoop_Break {
    public static void main(String[] args) {

        System.out.println("For loop Break");

        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
            switch (i){
                case 4:
                    System.out.println("Case 4");
                    break;
                case 5:
                    System.out.println("Case 5.");
            }//Switch case bitimi
            if (i==5){
                System.out.println("For loop tan break sayesinde çıktım.");
                break;
            }
        }//for loop sonu
        System.out.println("For loop bitti");
    }
}
