package Day14_Switch;

import java.util.Scanner;

public class switch02_Mevsimler {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print(" Lutfen Bir Ay ismi giriniz");
            String ay = scan.next();
            switch (ay ){
                case "ocak":
                case "Subat":
                case "Mart":
                    System.out.println( ay + " Kis Mevsimi");
                    break;
                case "Nisan":
                case "Mayis":
                case "Haziran":
                    System.out.println(ay + " Bahar Mevsimi");
                    break;
                case "Temmuz":
                case "Agustos":
                case "Eylul":
                    System.out.println(ay + " Yaz Mevsimi");
                    break;
                case "Ekim":
                case "Kasim":
                case "Aralik":
                    System.out.println(ay + " Sonbahar Mevsimi");
                    break;
                default:
                    System.out.println(" Lutfen gecerli bir ay ismi giriniz");

            }

        }
}
