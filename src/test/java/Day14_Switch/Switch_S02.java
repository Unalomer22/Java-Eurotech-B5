package Day14_Switch;

import java.util.Scanner;

public class Switch_S02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen Bir Ay ismi giriniz");
        String ay = scan.next();
        switch (ay ){
            case "ocak":
                System.out.println(1);
                break;
            case "Subat":
                System.out.println(2);
                break;
            case "Mart":
                System.out.println(3);
                break;
            case "Nisan":
                System.out.println(4);
                break;
            case "Mayis":
                System.out.println(5);
                break;
            case "Haziran":
                System.out.println(6);
                break;
            case "Temmuz":
                System.out.println(7);
                break;
            case "Agustos":
                System.out.println(8);
                break;
            case "Eylul":
                System.out.println(9);
                break;
            case "Ekim":
                System.out.println(10);
                break;
            case "Kasim":
                System.out.println(11);
                break;
            case "Aralik":
                System.out.println(12);
                break;
            default:
                System.out.println(" Lutfen gecerli bir ay ismi giriniz");

        }

    }
}
