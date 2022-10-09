package Day29;

import java.util.Scanner;

public class FinalTemperature {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isitilacak suyun kilosunu giriniz : ");
        double m = scan.nextDouble();// suKilo = m

        System.out.println(" Lutfen initial sicakligi giriniz : ");
        double initialTemperature = scan.nextDouble();

        System.out.println(" Lutfen Final sicakligini giriniz : ");
        double finalTemperature = scan.nextDouble();

        double q = m * (finalTemperature-initialTemperature) * 4184;
        System.out.println("q = " + q);
    }
}
