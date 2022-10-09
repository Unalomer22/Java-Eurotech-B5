package Day34;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiziAddObj {
    public static class Product{
        String name;
        int price;
        int miktar;

        public static void sepetList(Product[] sepet){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
            System.out.println();
            System.out.println("\tSepette bulunan ürünlerin listesi");
            System.out.println("\tÜrünün adı\tÜrünün fiyatı\tMiktarı");
            System.out.println("\t----------\t-------------\t-------");
            int toplam=0;
            for (int i = 0; i < sepet.length; i++) {
                System.out.println("\t"+ (i+1) + "-" + sepet[i].name + "\t\t" + sepet[i].price + "\t\t\t\t" + sepet[i].miktar + " kg");
                toplam += sepet[i].price * sepet[i].miktar;
            }
            System.out.println("\t-----------------------------------");
            System.out.println("\tToplam tutar = " + toplam + " TL");
            System.out.println("\t***   "+ LocalDateTime.now().format(formatter)+"    ***");
        }

    }
    public static void main(String[] args) {
        System.out.println("Alışveriş sepeti...");
        Product[] sepet = new  Product[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Sepete ekleyeceğiniz ürünleri giriniz...");

        for (int i = 0; i < sepet.length; i++) {
            sepet[i] = new Product();
            System.out.print((i+1) + ". ürünün adı ......: ");
            sepet[i].name = sc.nextLine();

            System.out.print((i+1) + ". ürünün fiyatı ...: ");
            sepet[i].price = sc.nextInt();

            System.out.print((i+1) + ". ürünün miktarı...: ");
            sepet[i].miktar = sc.nextInt();
            sc.nextLine();

            System.out.println();

        }

        Product.sepetList(sepet);
    }
}
