package Day13_IfElseIf;

import java.util.Scanner;

public class If_Else_M06 {
    public static void main(String[] args) {
        // Kullaniciya yasini sorun, eger yas 65 e esit veya kucuk ise "Emekli Olamazsin,calismalisin,
        // eger yas 65 ten buyuk ise " Emekli olabilirsin yazdirin.
        Scanner scan= new Scanner(System.in);
        System.out.println(" Lutfen yasinizi giriniz");

        int yas = scan.nextInt();

        if (yas<=65){
            System.out.println(" Emekli Olamazsin," + (65- yas ) + " sene daha calismalisin");
        } else{
            System.out.println(" Emekli olabilirsin");
        }

        scan.close();

    }
}
