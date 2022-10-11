package Day63;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ornek4 {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int sayi = 1, toplam = 0;

        while(sayi>0){
            System.out.println("Çıkış için klavyeden '0' giriniz.");
            System.out.print("Klavyeden bir tam sayı giriniz = ");

            try {
                if (sayi !=0){
                    // sayi = Integer.parseInt(klavye.nextLine());
                    sayi = klavye.nextInt();
                    //Bir "InputMismatchException" gibi bir hata yakalandığında program loop a girmemesi için
                    //İlgili hatanın olduğu catch bloğunda next.line ile klavye buffer ı boşaltılmalıdır.
                    //Bu tür hatalar ile karşılaşmamak için en doğru kullanım nextLine() ile girdi okunup ilgili veritipine dönüştürülmelidir.
                    System.out.println("Sayı = " + sayi);
                    toplam += sayi;
                    System.out.println("Toplam = " + toplam);
                }
            }
            catch (NumberFormatException e){
                System.out.println("Bir hata oluştu!");
                System.out.println("Lütfen klavyeden tam sayı giriniz.");
            }
            catch (InputMismatchException e){
                /*
                //Klavyeden enter a basıldığında girilen next.int tarafından integer ile alınır newline karakteri bufferda kalır.
                 O yüzden loop a girmemesi için next.line ile buffer boşaltılması gerekir.
                 */
                klavye.nextLine();
                System.out.println("Bir hata oluştu!");
                System.out.println("Lütfen klavyeden tam sayı giriniz.");

            }

        }
    }

}
