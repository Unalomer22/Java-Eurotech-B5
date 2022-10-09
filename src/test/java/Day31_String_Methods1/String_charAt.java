package Day31_String_Methods1;

public class String_charAt {
    public static void main(String[] args) {
     String word = "Computer";
        System.out.println("word.length() = " + word.length());
        System.out.println(word.charAt(0)); // index 0 her zaman 1. karakteri verir
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));
        System.out.println(word.charAt(5));
        System.out.println(word.charAt(6));
        System.out.println(word.charAt(7));
     //   System.out.println(word.charAt(8));
        System.out.println("son character dinamic = " + word.charAt(word.length()-1));

        if (word.charAt(0) == 'C'){
            System.out.println("İlk character dogrudur");
        } else {
            System.out.println("İlk character yanlıstır");
        }

    }
}
