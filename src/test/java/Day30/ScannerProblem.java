package Day30;

import java.util.Scanner;

public class ScannerProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Lutfen yasinizi giriniz : ");

        int yas = input.nextInt();
        input.nextLine(); // Eger bir int dan sonra String gelirse mutlaka " input.nextLine() " yazarak int islemi sonlandirmaliyiz

        System.out.println(" Lutfen adinizi giriniz ");
        String ad = input.nextLine();

        System.out.println("yasiniz = " + yas);
        System.out.println("adiniz = " + ad);
    }
}
