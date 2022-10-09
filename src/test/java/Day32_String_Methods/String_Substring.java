package Day32_String_Methods;

public class String_Substring {
    public static void main(String[] args) {
        String str = "Java String manuplation is fun";
        System.out.println(str.substring(5));// String manuplation is fun . Istenilen karakter (5) dahil kesme islemi yapilir
        System.out.println(str.substring(12,16));// manu   ilk karakter (12) dahil, son karakter (16) dahil degil

        System.out.println(str.substring(5,str.length()-5));// String manuplation i
        System.out.println(str.substring(5,str.length()-10));// String manuplat

        String symbols = "{{}}";
        String word = "JAVA IS COOL";
        String newString = symbols.substring(0,2).concat(word).concat(symbols.substring(2,symbols.length()));
        System.out.println("newString = " + newString);// {{JAVA IS COOL}}

        String newString1 = word.substring(0,7).concat(symbols.substring(0,2).concat(word.substring(8,word.length())).concat(symbols.substring(2,symbols.length())));
        System.out.println("newString1 = " + newString1);// JAVA IS{{COOL}}


    }
}
