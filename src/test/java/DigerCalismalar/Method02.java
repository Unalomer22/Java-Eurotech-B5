package DigerCalismalar;


public class Method02 {
    /*
        2 sayının toplamlarını bulup o sayıları maın methodda 10 ıle carpan kodu yazınız
     */
    public static void main(String[] args) {

      //  sayiToplami(3,8); bunu iki kere yazmaya gerek yok. o yuzden asagıda yazmak yeterli
        //int carpim = sayiToplami(3,8) * 10;
        System.out.println("carpim = " + sayiToplami(3,8) * 10);
    }
    public static int sayiToplami(int a, int b){
        //int toplam = a + b;
        return a+b;
    }
}