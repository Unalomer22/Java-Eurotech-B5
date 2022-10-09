package DigerCalismalar;

public class InsanTest {
    public static void main(String[] args) {
      Insan insan = new Insan() ;

        System.out.println(insan.getKilo());
        System.out.println(insan.getBoy());

        insan.setKilo(27);
        System.out.println(insan.getKilo());// 27

        insan.setBoy(66);
        System.out.println(insan.getBoy());// 66
    }
}
