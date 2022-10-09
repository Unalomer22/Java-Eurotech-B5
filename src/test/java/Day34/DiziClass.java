package Day34;

public class DiziClass {
    public static class Product{
        String name;
        int price;
    }
    public static void main(String[] args) {
        Product[] sepet = new Product[5];
        Product p1 = new Product();
        Product p2 = new Product();
        p1.name = "Elma";
        p1.price = 10;

        p2.name = " Armut";
        p2.price = 15;

        sepet[0]= p1;
        sepet[1] = p2;
        int toplam = 0;
        for (int i = 0; i< 2 ; i++){
            System.out.println(sepet[i].name);
            System.out.println(sepet[i].price);
            toplam += sepet[i].price;
        }
        System.out.println("Toplam = " + toplam);
    }
}