package Day17_ForLoop;

public class ForLoop_Saat {

    public static void main(String[] args) {
        int a=0;
        for (int i = 0; i <24 ; i++) { // 24 Saat icin
            for (int j = 0; j <60 ; j++) { // 60 dakika icin
                for (int k = 0; k <60 ; k++) { // 60 saniye icin
                    System.out.print("\r" + i + ":" + j + ":" + k); // "\r" bu isaret ayni satirda birbiri uzerine yazdirmak icin
                    for (int l = 0; l < 1_000_000_000; l++) {
                        a = a+l;
                    }
                    a=0;
                }
            }
        }
    }
}
