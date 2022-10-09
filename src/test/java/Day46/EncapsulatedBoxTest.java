package Day46;

public class EncapsulatedBoxTest {
    public static void main(String[] args) {
        EncapsulatedBox kutu1 = new EncapsulatedBox();

       kutu1.degerataEn(15);

       EncapsulatedBox kutu2 = new EncapsulatedBox(15,10,5);
        System.out.println("kutu2.getHacim() = " + kutu2.getHacim());// kutu2.getHacim() = 750

        System.out.println("kutu1.degerokuEn() : " +kutu1.degerokuEn());// 15
        System.out.println("kutu1.getEn() = " + kutu1.getEn());// 15

        System.out.println("kutu1.getHacim() : "+kutu1.getHacim());
    }
}
