package Day31_String_Methods1;

public class String_Length {
    public static void main(String[] args) {

        String str = "EuroTech Study";

        int uzunluk = str.length();

        System.out.println("uzunluk = " + uzunluk);

        // 2.yol
        System.out.println("str.length() = " + str.length()); //

        String str2 = "";
        System.out.println("str2.length = " + str2.length());

        String str3 = " ";
        System.out.println("str3.length = " + str3.length());

        int carpim = str3.length() * 5;
        System.out.println("carpim = " + carpim);

    }
}
