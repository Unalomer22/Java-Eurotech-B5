package Day13_IfElseIf;

public class Nested_If_S4 {
    public static void main(String[] args) {
       // 1. Örnek
        int vize1 = 50;
        int vize2 = 40;
        int ortalama = (vize1 + vize2) / 2 ;
        boolean bl = vize1<0 || vize2<0 || vize1>100 || vize2>100;

        if(bl) {
            System.out.println(" Gecerli not giriniz");
        } else if ( ortalama > 70 ) {
            System.out.println(" Woooow!!");
        }else if (ortalama > 45){
            System.out.println(" Himmmm!");
        }else {
            System.out.println(" Off Anam OFF !!!");
        }// Ekrana Off Anam OFF !!! yazdirir.
        System.out.println("...............................");
    // 2. Örnek
        int vize3 = 50;
        int vize4 = 70;
        int ortalama1 = (vize3 + vize4) / 2 ;
        boolean bl1 = vize3<0 || vize4<0 || vize3>100 || vize4>100;

        if(bl1) {
            System.out.println(" Gecerli not giriniz");
        } else if ( ortalama1 > 70 ) {
            System.out.println(" Woooow!!");
        }else if (ortalama1 > 45){
            System.out.println(" Himmmm!");
        }else {
            System.out.println(" Off Anam OFF !!!");
        }// Ekrana Himmmm! yazdirir.
        System.out.println("...............................");

        // 3. Örnek
        int vize5 = 80;
        int vize6 = 70;
        int ortalama2 = (vize5 + vize6) / 2 ;
        boolean bl2 = vize5<0 || vize6<0 || vize5>100 || vize6>100;

        if(bl2) {
            System.out.println(" Gecerli not giriniz");
        } else if ( ortalama2 > 70 ) {
            System.out.println(" Woooow!!");
        }else if (ortalama2 > 45){
            System.out.println(" Himmmm!");
        }else {
            System.out.println(" Off Anam OFF !!!");
        }// Ekrana Woooow!! yazdirir.

    }
}
