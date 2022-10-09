package Day17_ForLoop;

public class ForLoop_S04 {
    public static void main(String[] args) {
        /*
        5 ten 12 ye kadar olan tum sayilarin toplamini hesaplayip ekrana yazdiran programi yazdirin
         */
        int toplam = 0;

        for( int i = 5 ; i<=12 ; i++) {
             toplam = toplam + i;
    // System.out.println(" Toplam : " + toplam); buraya yazildiginda ara toplamlarin hepsini ayri ayri gosterir
        }

        System.out.println(" Toplam : " + toplam);

    }
}
