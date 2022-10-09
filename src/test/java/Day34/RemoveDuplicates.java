package Day34;

// Write a return method that can remove the duplicated values from String
// Tekrar eden harflerden sadece bir tanesini yazdirmali

public class RemoveDuplicates {

    public static String removeDuplicated(String inputText){
        String result= "";

     for(int i = 0; i< inputText.length(); i++){
         if(!result.contains(String.valueOf(inputText.charAt(i)))){ // if(!result.contains((inputText.charAt(i) + ""))) ayni sonucu verir
             result += String.valueOf(inputText.charAt(i));
         }
     }
        return result;}

    public static void main(String[] args) {
        String strTest = "DDEECGDDEEEEFGGDCDD";

        String result = removeDuplicated(strTest);

        System.out.println(result);


    }
}
