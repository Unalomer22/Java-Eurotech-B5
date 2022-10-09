package Day32_String_Methods;

public class String_IndexOf {

    public static void main(String[] args) {

        String word = "Germany";
        System.out.println("word.indexOf('t') = " + word.indexOf('t'));// -1 yani bu character yok
        System.out.println(word.indexOf("G")); // 0. character
        System.out.println(word.indexOf("rma"));// 2. character
        System.out.println(word.indexOf("zzz")); // olmayan karakterde -1 yazar

        String url = "www.eurotechstudy.com.";
        int index = url.indexOf(".");
        System.out.println("index = " + index);// 3. character
        System.out.println(url.charAt(index));// .
        System.out.println(url.indexOf(".", index + 1)); // 17
        System.out.println(url.indexOf(".",index +2));//21
        System.out.println(url.lastIndexOf("."));// son 17

        System.out.println(url.indexOf("e"));// 4
        int index1 = url.indexOf("e");
        System.out.println("url.charAt(index1) = " + url.charAt(index1));// e
        System.out.println(url.indexOf("e", index1 +1));// 9
    }
}







