package Day14_Switch;

import java.util.Scanner;

public class switch_Ömer1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen parayi havaya atiniz");

        String para = scan.next();
        switch (para){
            case "1":
                System.out.println(" Yazi");
                break;
            case "2":
                System.out.println(" Tura");
                break;
            case "3":
                System.out.println(" Dik :))");
                break;
            default:
                System.out.println(" Lutfen para kullaniniz");
        }
    }
}
