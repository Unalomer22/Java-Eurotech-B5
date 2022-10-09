package Day49_Inheritance;

import java.sql.SQLOutput;

public class Animal {

    public Animal(){
        System.out.println("Animal parametresiz constructor  ");
    }

    public void hareket(){
        System.out.println("Hareket eder");
    }

    public void yeme(){
        System.out.println("Yemek yerler.");
    }
    public void icme(){
        System.out.println("Su icerler.");
    }

}
