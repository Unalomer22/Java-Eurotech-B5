package Day33_Array;

public class ForEach {
    public static void main(String[] args) {

        System.out.println(" For each metodu ile dizi elemanlarinin yazdirilmasi");

        int [] sayilar = new int[3];
        double [] doubleSayilar = {1.3, 4.5, 3.7};

        sayilar[0]= 1;
        sayilar[1]= 5;
        sayilar[2]= 25;

        for (int sayi : sayilar){
            System.out.println("Sayi... = " + sayi);
        }

        System.out.println(" Double veri tipindeki dizi elemanlari");
        for (double dbl : doubleSayilar){
            System.out.println("doubles = " + dbl);
        }
    }
}
