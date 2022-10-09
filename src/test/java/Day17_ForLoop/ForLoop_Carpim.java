package Day17_ForLoop;

public class ForLoop_Carpim {
    public static void main(String[] args) {
        System.out.println("For Loop .........");
    System.out.println("Çarpım tablosu");
        System.out.println("---------------------");
        System.out.println();
        int sonuc = 0;
        for (int i = 1; i <= 10; i++) {
        if ((i == 6) || (i==9) || (i==10)){
            System.out.println(i + " lar......");
        }else{
            System.out.println(i + " ler........");
        }

        System.out.println("--------------");
        for (int j = 1; j <= 10 ; j++) {
            System.out.println("Sonuc = " + i + "*" + j +"= "  + (i * j));

        } // iç for loop
        System.out.println();

    }//En dış for loop

        System.out.println("Bir baska gösterimle Carpım tablosu");
        int altcizgi, i , j;
        System.out.println("\t\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10 ");
        for (altcizgi=1; altcizgi<=50 ; altcizgi++) { // Döngüyle uzun bır cızgı cızelım
            System.out.println("-");
        }
        System.out.println();
        for (i=1 ; i<10 ; i++){
            System.out.println(i + "\t|\t");
            for (j=1; j<=10 ; j++){
                System.out.println(i*j + "\t");
            }
            System.out.println();
        }



}

}
