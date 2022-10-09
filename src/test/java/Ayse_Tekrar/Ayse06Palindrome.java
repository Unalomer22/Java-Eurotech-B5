package Ayse_Tekrar;

public class Ayse06Palindrome {
    public static void main(String[] args) {
        String original = "radar";
        String reverse = "";

        for (int i = original.length()-1; i >=0 ; i--) {
            reverse += original.charAt(i);
        }

        if(original.equals(reverse)){
            System.out.println(original+ " palindrome dur.");// radar palindrome dur.
        }else System.out.println(original+ " palindrome degildir.");

        // 2.yol

        String str = "madam";
        boolean isPalindrome = true;
        int lastIndex = str.length()-1;
        int firstIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(firstIndex) != str.charAt(lastIndex)){
                isPalindrome = false;
                break;
            }
            lastIndex--;
            firstIndex++;
        }
        System.out.println("Your input is " + isPalindrome);//Your input is true




    }
}
