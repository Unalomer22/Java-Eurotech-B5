package Day47;

class Deneme{

    public void deneme(){
        System.out.println();
        System.out.println("Static.numberStc = " + Static.numberStc);
    }
    public static void denemeStatic(){
        System.out.println("Deneme Class static method called");
    }

}

public class Static {

    static int numberStc;// Statık degıskenler Class lara aıttır

    int numberNonStc;// O Class dan üretılen objelere aıttır

    public static void main(String[] args) {
// Bir class dan sinirsiz sayida obje üretebiliriz
        Static stc = new Static();
        Static stc1 = new Static();
        Static stc2 = new Static();
        Static stc3 = new Static();
        Static stc4 = new Static();
        Static stc5 = new Static();

        Static.numberStc = 65;

        Static.numberStc = 23;// Önceki Static degerler silinir en son ki deger kalir
        Static.numberStc = 15;

        Deneme dnm = new Deneme();
        dnm.deneme();

        Deneme.denemeStatic();

        stc.numberNonStc = 1;
        stc1.numberNonStc = 5;
        stc2.numberNonStc = 3;

        System.out.println("stc1.number1 = " + stc1.numberNonStc);// 5
        System.out.println("stc.number1 = " + stc.numberNonStc);// 1
    }
    {
        System.out.println("deneme block");
    }
}
