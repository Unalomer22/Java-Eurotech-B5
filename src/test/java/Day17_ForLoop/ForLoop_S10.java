package Day17_ForLoop;

public class ForLoop_S10 {

    public static void main(String[] args) {

        /*
        For loop kullanarak asagida verilen sekli olusturunuz
                    *
                    **
                    ***
                    ****
                    *****
         */
        for (int i = 1; i <= 5; i++) { // i satir sayisini gosteriyor

            for (int k = 1; k <= i; k++) { // Yildiz sayisini gosteriyor.
                System.out.print(" * ");

            }

            System.out.println();

        }
    }
}
