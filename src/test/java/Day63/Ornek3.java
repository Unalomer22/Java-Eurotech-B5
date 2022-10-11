package Day63;

import java.util.Scanner;

public class Ornek3 {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");

        try {
            int sayi = Integer.parseInt(klavye.nextLine());
            System.out.println("Sayı : " + sayi);
            int islem = sayi / 0;
            String str = null;
            System.out.println("Deneme" + str.replace("a","b"));
        }
        catch (NumberFormatException e){
            // e.printStackTrace();
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("O a bölünme hatası.");
            System.out.println(e);
        }
        catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("String değeri null olduğu için hata oluştu.");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Bir hata oluştu.");
        }
    }
}
