package Day5;

public class Variables2 {

    public static void main(String[] args) {
        System.out.println("Variables and Data Types -2 dersine hoşgeldiniz.");
        //Concatenation(+)
        int vizeNotu1, vizeNotu2, finalNotu;
        float dersGecmeNotu, vizeYuzdeOtuz, finalYuzdeYetmis;
        boolean gecti;

        vizeNotu1=50;
        vizeNotu2=50;
        finalNotu=10;
        vizeYuzdeOtuz = (vizeNotu1 + vizeNotu2)/2 * 0.30f;
        finalYuzdeYetmis = finalNotu * 0.70f;

        //vizeYuzdeOtuz + finalYuzdeYetmis her iki değişken de float tipinde olduklarından + işlemi ARİTMETİK TOPLAMA İŞLEMİDİR.
        dersGecmeNotu = vizeYuzdeOtuz + finalYuzdeYetmis;

        gecti = (dersGecmeNotu >= 50 ); //boolean değişkene parantez içerisindeki mantıksal karşılaştırmayı atatık

        //println komutu içerisindeki ilk ifade String olduğundan + işlemi Concatenation yani Birleştirme işlemi olarak çalışır
        System.out.println("Ders geçme notu " + dersGecmeNotu);
        System.out.println("Ders geçme durumu..: " + gecti);

    }

}
