package Day19_WhileLoop;

public class WhileLoop_10_Ornek1 {

    public static void main(String[] args){
        System.out.println("While loop Ornek");

        byte x = 1; // -128  127 Sonucun negatif cikmasi islemin sonsuz donguye girmek istemesinden dolayi
        while (x > 0){
            x++;
            System.out.println("x...: " + x);
        }
        System.out.println("x = " + x);
    }
}


