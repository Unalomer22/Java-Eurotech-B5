package Day19_WhileLoop;

public class WhileLoop_08_Even_OddNumberAdd {
    public static void main(String[] args) {
        System.out.println("0 ile 100 arasındaki çift sayıların toplamı...");

        int i = 0;
        int sumCift = 0;
        int sumTek = 0;

        while (i < 10) {

            if (i % 2 == 0) {
                sumCift = sumCift + i;
                System.out.println("Çift sayılar...: " + i);
            }
            if (i % 2 != 0) {
                sumTek = sumTek + i;
                System.out.println("Tek sayılar...: " + i);
            }
            i++;
        }
        System.out.println("Tek Sayıların Toplamı...: " + sumTek);
        System.out.println("Çift Sayıların Toplamı...: " + sumCift);
    }

}
