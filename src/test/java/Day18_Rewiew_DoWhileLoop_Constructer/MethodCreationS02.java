package Day18_Rewiew_DoWhileLoop_Constructer;

public class MethodCreationS02 {
    public static void main(String[] args) {
        add(3,5);
        concatenate("Merhaba ","Dunya");

        System.out.println(add(3,5));// 8
        System.out.println(concatenate("Merhaba ","Dunya"));// Merhaba Dunya
    }
    public static int add (int a, int b){

        return a+b;
    }
    public static String concatenate ( String s, String t){

        return s.concat(t);// s+t olarak da yazabiliriz String oldugu icin
    }
}
