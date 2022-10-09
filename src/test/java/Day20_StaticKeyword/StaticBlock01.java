package Day20_StaticKeyword;

public class StaticBlock01 {
    static double pi;
    static String s;
/*
    1) Static block static variable lara deger atamasi(initialize) yapmak icin kullanilir
    2) Static Block class olusturulurken butun methodlardan (main method dahil) önce calistirilir
    3) Birden fazla static block varsa en ustteki en önce calisir.
 */
    static {
        pi = 3.14;
    System.out.println(pi);
    }

    static {
        s = "Ali " + pi;
        System.out.println(s);
    }
    public static void main(String[] args) {
        alanDaire(10);
    }

    public static void alanDaire(double r){
        System.out.println("Dairenin alani : " + pi * r * r);// Dairenin alani : 314.0
    }
}
