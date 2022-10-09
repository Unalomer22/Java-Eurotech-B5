package Day48;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.toplam(15,5);
        System.out.println("calc.sonuc = " + calc.sonuc);// 20

        calc.carpma(45,60);
        System.out.println("calc.sonuc = " + calc.sonuc);// 2700

        Calculator.toplam(2,5);
    }
}
