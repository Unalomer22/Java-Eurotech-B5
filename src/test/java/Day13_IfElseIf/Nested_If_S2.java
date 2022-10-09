package Day13_IfElseIf;

public class Nested_If_S2 {
    public static void main(String[] args) {
        int temperature = 140;

        if( temperature < 0 ) {
            System.out.println(" Soguk");
        } else if (temperature < 30 ){
            System.out.println(" Iyi");
        } else if (temperature < 50 ) {
            System.out.println(" Sicak");
        } else {
            System.out.println(" Yaniyor");
        }

    }
}
