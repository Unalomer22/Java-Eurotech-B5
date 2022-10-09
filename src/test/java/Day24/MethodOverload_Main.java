package Day24;

public class MethodOverload_Main {
    public static void main(String[] args) {
        System.out.println("Hı from main method");
        main( "merhaba", "canlar");
        main("heyyyy");
    }
     public static void main(String str1, String str2){
         System.out.println("Hı from third main method");
         System.out.println("str1 =" + str1);
         System.out.println("str2 = " + str2);
         main("omer baba");
     }
     public static void main ( String str) {
         System.out.println(str);
         System.out.println("Hi from second main method");
     }
}
