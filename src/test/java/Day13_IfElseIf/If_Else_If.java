package Day13_IfElseIf;

public class If_Else_If {

    public static void main(String[] args) {

        int a = 8 ;

        if(a>= 10){
            System.out.println("A sayisi 10 a esittir.");
        } else{
            System.out.println("False");
        }
// Ikinci yol

boolean kontrol = false;
        kontrol = a>=10; // a>10 || a == 10 yandaki islemler ayni sonucu veriyor.

if (kontrol){
    System.out.println("A sayisi 10 a esittir.");
}
else {
    System.out.println("false");
}


    }

}
