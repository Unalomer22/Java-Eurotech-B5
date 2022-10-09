package Day32_String_Methods;

public class String_Trim {
    public static void main(String[] args) {
        String str1 = "    Hello World   ";
        System.out.println(str1.trim());// Hello World
        System.out.println(str1);//     Hello World

        String str2 = "   Hellom        World           ";
        System.out.println(str2.trim());// Hellom        World
        System.out.println(str2.replace(" ",""));// HellomWorld


    }
}
