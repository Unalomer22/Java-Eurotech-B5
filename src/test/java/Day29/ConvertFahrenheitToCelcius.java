package Day29;

import java.util.Scanner;

public class ConvertFahrenheitToCelcius {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen Centigrat degerini giriniz.. : ");

        double celcius = scan.nextDouble();
        double fahrenheit= (9.0/5)* celcius + 32;// 9.0 yerine 9 alirsak sonuc yanlis cikar.
        double fahrenheit1= 1.8 * celcius + 32;

        System.out.println("fahrenheit = " + fahrenheit);
        System.out.println("fahrenheit1 = " + fahrenheit1);



    }
}
