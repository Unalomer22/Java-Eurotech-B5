package Day13_IfElseIf;

import java.util.Scanner;

public class If_Else_M04 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir gun ismi alin.
        ve haftaici veya hafta sonu oldugunu yazdirin.
        Ornek: gun= Pazar output= " Hafta sonu"
                gun= Sali output= " Hafta ici"

                String icin equals method unu kullanin
         */

        Scanner scan = new Scanner(System.in);

        System.out.println(" Lutfen bir gun ismi giriniz");
        String gun = scan.next().toLowerCase();
        int flag = 0; // Bunu olasi farkli durumlar icin yazdik.

        if (gun.equals( "pazartesi") || gun.equals("sali") || gun.equals("carsamba") ||
                gun.equals( "persembe") || gun.equals("cuma")){
            System.out.println("Hafta Ici");
            flag++;
        }if (gun.equals( "pazar") || gun.equals("cumartesi")){
            System.out.println("Hafta Sonu");
            flag++;
        } if(flag==0) {
            System.out.println(" Lutfen gecerli bir gun ismi giriniz");
        }
        scan.close();
    }
}
