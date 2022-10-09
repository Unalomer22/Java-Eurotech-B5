package Day17_ForLoop;

import java.util.Scanner;

public class ForLoop_Basit {
    public static void main(String[] args) {
        System.out.println("For Loop..");


        Scanner input = new Scanner(System.in);

        String ad=input.nextLine();
        System.out.print("Adınızı yazınız..: ");


        System.out.print("Kaç defa yazayım...: ");
        int tekrarSayisi = input.nextInt();

        for(int i = 1; i <= tekrarSayisi; i++){

            System.out.println(i + "-" + ad);

        }
    }
}
