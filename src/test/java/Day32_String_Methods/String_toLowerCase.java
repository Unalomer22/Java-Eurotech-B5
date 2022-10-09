package Day32_String_Methods;

public class String_toLowerCase {
    public static void main(String[] args) {

        String str = " Hello World";
        System.out.println(str.toLowerCase());// hello world

        String str2 = " hssdhzAAgbdDCnfjuVBNHJUZ";
        System.out.println(str2.toLowerCase());// hssdhzaagbddcnfjuvbnhjuz

         String str3 = "254356#µ§$";
        System.out.println(str3.toLowerCase());// 254356#µ§$ ==> bu method sadece buyuk harfleri kucuk harf yapar rakam ve sembolleri degil
    }
}
