package Day13_IfElseIf;

public class IfElseIf2 {
    public static void main (String [] args){
        double score = 45;
        // 1. yol
        if ( score > 100 ){
            System.out.println(" Lutfen 100 veya 100 den kucuk sayi giriniz");
        }
        else if (score >= 90.0 ){
            System.out.println("A");
        } else if (score >= 80.0){
            System.out.println("B");
        } else if (score >= 70.0){
            System.out.println("C");
        } else if (score >= 60.0){
            System.out.println("D");
        } else if ( score >= 0){
            System.out.println("F");
        } else {
            System.out.println("Lutfen pozitif bir sayi giriniz");
        }
        System.out.println("*********************");
// 2. Yol
        if (score < 0.0 ){
            System.out.println("Lutfen pozitif bir sayi giriniz");
        } else if (score < 60.0){
            System.out.println("F");
        } else if (score < 70.0){
            System.out.println("D");
        } else if (score < 80.0){
            System.out.println("C");
        } else if ( score < 90.0){
            System.out.println("B");
        } else if( score <= 100) {
            System.out.println("A");
        } else {
            System.out.println(" Lutfen 100 veya 100 den kucuk sayi giriniz");
        }
    }
}
