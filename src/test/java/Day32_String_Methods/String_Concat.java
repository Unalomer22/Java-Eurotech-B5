package Day32_String_Methods;

public class String_Concat {
    public static void main(String[] args) {

        String word = " Hello";
        System.out.println(word);// Hello
        System.out.println(word.concat("World"));//HelloWorld
        System.out.println(word);// Hello
        word = word.concat("World");
        System.out.println(word);//HelloWorld

        // word = word.concat(123) Bu sekılde yazmaz

        word.concat("123");
        word = word + 123 ;// Bu ifade yandaki ifade  word.concat("123"); ile ayni

        word = word.concat(" Hi ").concat(" How are you?").concat(" I m fine");
        System.out.println(word);// HelloWorld123 Hi  How are you? I m fine

    }

}
