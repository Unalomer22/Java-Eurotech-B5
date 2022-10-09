package Day31_String_Methods1;

public class StringClass {

    public static void main(String[] args) {

        //String Literal yontemle object olusturma
        String str = "Hello World";
        System.out.println("str = " + str);

        //new keyword yontemiyle object olusturma
        String str6 = new String("Hello World");
        System.out.println("str6 = " + str6);

        String str1 = new String ("EuroStudy" );
        String str2 = new String ("EuroStudy" );
        String str3 = "EuroStudy";
        String str4 = "EuroStudy";

        System.out.println(str1==str2);// false
        System.out.println(str1==str3);// false
        System.out.println(str1==str4);// false
        System.out.println(str2==str3);// false
        System.out.println(str2==str4);// false
        System.out.println(str3==str4);// true
    }
}
