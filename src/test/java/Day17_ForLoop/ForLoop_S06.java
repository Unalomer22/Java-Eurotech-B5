package Day17_ForLoop;

public class ForLoop_S06 {

    public static void main(String[] args) {

        //  18  ten 3 e kadar olan tum sayilarin toplamini hesaplayip ekrana yazdiran programi yazdirin

        int toplam = 0;

        for (int i=18; i>=3 ; i--) {
            toplam = toplam + i ;
        }

        System.out.println(" Toplam : " + toplam);



    }
}
