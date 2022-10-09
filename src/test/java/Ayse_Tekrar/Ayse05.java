package Ayse_Tekrar;

public class Ayse05 {
    public static void main(String[] args) {
        // Write a program to print only vowel (a,e,o,i,u,ü,ö) in given string
        // String : "merhaba dünyam", output ; e,a,a,ü,a

        String str = "Program Files JetBrains IntelliJ IDEA Community Edition";

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (character=='a' || character == 'e' || character=='i' || character == 'o' ||character=='ö' || character == 'u'||
                    character=='ü'){
                System.out.print(character);

                if (i!= str.length()-1){
                    System.out.print(",");
                }
            }

        }



    }
}
