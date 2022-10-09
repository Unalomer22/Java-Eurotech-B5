package Day18_Rewiew_DoWhileLoop_Constructer;

import java.util.Scanner;

public class DoWhileLoopS01 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir String aliniz
        Bu String icinde kac tane rakam kac tane harf kac tane diger character oldugunu gosteren programi yaziniz
         */
        Scanner scan = new Scanner (System.in);
        System.out.println("Bir String giriniz");
        String s = scan.nextLine();

        int harfCounter = 0;
        int rakamCounter = 0;
        int digerCounter = 0;
        int k= 0; // index numarasi 0 dan baslar

        do {
            if(s.length()==0){
                System.out.println("Sana String gir dedik!");
            }
            else if ((s.charAt(k)>= 'a' && s.charAt(k)<='z') || (s.charAt(k)>= 'A' && s.charAt(k)<='Z')){
                harfCounter++;
            } else if ((s.charAt(k)>= '0' && s.charAt(k)<='9')) {
                rakamCounter++;
            }else {
                digerCounter++;
            }
            k++;
        }while (k< s.length());

        System.out.println("harfCounter = " + harfCounter);
        System.out.println("rakamCounter = " + rakamCounter);
        System.out.println("digerCounter = " + digerCounter);

        scan.close();
    }
}
