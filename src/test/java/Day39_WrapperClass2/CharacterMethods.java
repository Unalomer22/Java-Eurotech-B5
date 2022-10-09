package Day39_WrapperClass2;

public class CharacterMethods {
    public static void main(String[] args) {

        System.out.println(Character.isAlphabetic('c'));// true
        System.out.println(Character.isAlphabetic('7'));// false

        System.out.println(Character.isLetter('K'));// true
        System.out.println(Character.isLetter('9'));// false
        System.out.println(Character.isLetter('µ'));// true

        System.out.println(Character.isDigit('3'));// true
        System.out.println(Character.isDigit('*'));// false

        String word = "Java2020";

        System.out.println(Character.isAlphabetic(word.charAt(2)));// true
        System.out.println(Character.isDigit(word.charAt(5)));// true
        System.out.println(Character.isLetter(word.charAt(5)));// false
        System.out.println(Character.isDigit(word.charAt(3)));// false

        System.out.println('\u2164'); // Ⅴ
        System.out.println(Character.isLetter('\u2164'));// false
        System.out.println(Character.isAlphabetic('\u2164'));// true
    }
}
