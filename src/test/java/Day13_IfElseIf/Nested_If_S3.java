package Day13_IfElseIf;

public class Nested_If_S3 {
    public static void main(String[] args) {
  // 1. Örnek
      int a = 4;
      int b = 4;
      int c = 4;
        if ( a<b && c<b) {
            System.out.println(" x ");
        }else if ( a<b || c<b) {
            System.out.println(" y ");
        } else {
            System.out.println(" z ");
        }
        // Ekran z yazdirir.
        System.out.println(".................");
 // 2. Örnek
        int a1 = 4;
        int b1= 6;
        int c1 = 3;
        if ( a1<b1 && c1<b1) {
            System.out.println(" x ");
        }else if ( a1<b1 || c1<b1) {
            System.out.println(" y ");
        } else {
            System.out.println(" z ");
        }
        // Ekran x yazdirir
        System.out.println(".................");
 // 3. Örnek
        int a2 = 4;
        int b2 = 6;
        int c2 = 7;
        if ( a2<b2 && c2<b2) {
            System.out.println(" x ");
        }else if ( a2<b2 || c2<b2) {
            System.out.println(" y ");
        } else {
            System.out.println(" z ");
        }
        // Ekran y yazdirir
        System.out.println(".................");
    }
}
