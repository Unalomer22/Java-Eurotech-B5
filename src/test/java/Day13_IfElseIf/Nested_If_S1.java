package Day13_IfElseIf;

public class Nested_If_S1 {
    public static void main(String[] args) {
        /* Sisteme bir sayi giriniz.
        Eger sayi pozitif ise ; 10 dan buyuk olup olmadigini kontrol edin.
        Eger sayi 10 dan buyuk ise " Buyuksun" yazdirin.
        Eger sayi 10 dan buyuk ise " Normalsin" yazdirin.

        Eger sayi negatif ise ; -10 dan kucuk olup olmadigini kontrol edin.
        Eger sayi -10 dan buyuk ise " Negatifsin" yazdirin.
        Eger sayi -10 dan kucuk  veya esit ise " Cok Negatifsin" yazdirin.
         */

        int s = -45;

        if ( s>0){
            if (s>10){
                System.out.println("Buyuksun");
            }else {
                System.out.println(" Normalsin");
            }

        } else {
            if (s > -10){
                System.out.println("Negatifsin");
            }else {
                System.out.println(" Cok Negatifsin");
            }
        }
    }
}
