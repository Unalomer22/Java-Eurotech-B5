package Day33_Array;

public class Vargs {
    // Variable arguments passing to a method
    public static int toplama(int ... sayilar){
        int toplam = 0;
        for(int i =0; i<sayilar.length; i++){
            toplam = toplam + sayilar[i];
        }
        return toplam;
    }
    public static void main(String[] args) {
        int sonuc = toplama(1,3,5,6,7,8,923,45,67);
        int sonuc1 = toplama(1,2,3);
        System.out.println("sonuc = " + sonuc);
        System.out.println("sonuc1 = " + sonuc1);
    }
}
