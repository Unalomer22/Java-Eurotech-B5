package Ayse_Tekrar;

public class Etut_2 {

    public static void main(String[] args) {

        String str = "hayat hala havada";
        String aranacak = "ha";
        int counter= 0;

        for (int i = 0; i < str.length()-1; i++) {
            if(str.substring(i,i+2).equals("ha")){
                counter++;
            }
        }
        System.out.println("counter = " + counter);// 3


    }
}
