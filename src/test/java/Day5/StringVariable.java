package Day5;

public class StringVariable {

    public static void main(String[] args) {
        int sayi1,sayi2;
        String sayiA, sayiB;
        String mesaj;
        char abc ='B';

        mesaj = "Merhaba";
        System.out.println(mesaj);

        sayi1 =2_134_567_890; //okunaklı bir gösterim için '_' karakteri kullanıldı.

        /*sayiA ve sayiB değişkenleri String tipinde değişkenler olduklarından
        parantezin içerisine yazılsalar bile
        sayiA + sayiB işlemi Concatenation yani birleştirme olur.
        */
        sayiA = "10";
        sayiB = "30";
        System.out.println("SayıA + SayıB = " + (sayiA + sayiB));


        /*sayi1 ve sayi2 int tipinde tamsayı değişkenleri olduğundan ve + işlemi
        aritmetik toplama işlemi olarak yapılır.
         */
        sayi1 = 20;
        sayi2 = 30;
        System.out.println("Sayı1 + Sayı2 = " + (sayi1 + sayi2));

    }

}
