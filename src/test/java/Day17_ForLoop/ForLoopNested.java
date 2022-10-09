package Day17_ForLoop;

public class ForLoopNested {

    public static void main(String[] args) {
        System.out.println("Nested for loop (iç içe for döngüsü ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "-Ahmet(en dış loop)");

            for(int j = 1; j<=3; j++){
                System.out.println( j + "-Mehmet(iç loop-1)");

                for (int k = 1; k <=3 ; k++) {
                    System.out.println(j + "-Ali (iç loop-2)");
                }
            }
        }
    }









}
