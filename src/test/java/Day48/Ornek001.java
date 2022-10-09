package Day48;

public class Ornek001 {
    static  int a = 5;
    static int b;

    static {
        b=15;
        System.out.println("Executing static block");
    }

    {// Non-Statik block
        System.out.println("Executing non-static block");
    }
Ornek001(){
    System.out.println("Executing Constructor");
}
    public static void main(String[] args) {
        System.out.println("Execution of main method");

        Ornek001 ornek001 = new Ornek001();

        /* Ekrana yazdirma sirasi
        Executing static block
        Execution of main method
        Executing non-static block
        Executing Constructor
         */
    }
}
