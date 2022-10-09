package Day14_Switch;

import java.util.Scanner;

public class Switch_S03 {
    public static void main(String[] args) {
        /*
        Kullanici ay ismini girdiginde o ayin kac cektigini ekrana yazan bir program yaziniz
         */
        System.out.println(" Bir ay ismi giriniz");

        Scanner scan = new Scanner(System.in);
        String ay = scan.next().toLowerCase();
        switch (ay){
            case "ocak":
            case "mart":
            case "mayis":
            case "temmuz":
            case "agustos":
            case "ekim":
            case "aralik":
                System.out.println(31);
                break;
            case "subat":
                System.out.println("28 veya 29");
                break;
            case "nisan":
            case "haziran":
            case "eylul":
            case "kasim":
                System.out.println(30);
                break;
            default:
                System.out.println(" Lutfen gecerli bir ay ismi giriniz");
        }
scan.close();
    }
}
