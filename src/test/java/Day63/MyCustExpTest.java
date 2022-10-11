package Day63;

public class MyCustExpTest {

    static void yasKontrol(int yas) throws MyCustomException {
        if (yas < 18){
            throw new MyCustomException("Oy verme yaşı 18 den küçük olamaz!");
        } else System.out.println("Tebrikler. Oy kullanabilirsiniz.");
    }

    public static void main(String[] args) {

        try {
            yasKontrol(17);

        }catch (MyCustomException e){
            e.printStackTrace();

        }

    }
}
