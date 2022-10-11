package Day63;

public class Ornek2 {

    public static void main(String[] args) {
        try{
            int a[] = new int[2];
            a[1] = 8;
            int x = 9/0;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Hata oluştu---> Array in olmayan indexine kayıt ekleme hatası...");
            // e.printStackTrace();
        }

        catch (ArithmeticException e){
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("Hata oluştu---> O a bölünme hatası..");

        }
        System.out.println("Devam et.");
    }
}
