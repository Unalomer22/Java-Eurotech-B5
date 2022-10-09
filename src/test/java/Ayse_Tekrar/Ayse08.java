package Ayse_Tekrar;

public class Ayse08 {
    public static void main(String[] args) {
        int a=1 , b=15;
        while (a<10){
            b--;
            a++;// a en son 9 alir fakat ++ dan dolayi a nin son degeri 10 olur
        }
        System.out.println(a+" , "+b);// 10,6

        String s = "MINIMUM";
        System.out.println(s.substring(4,7));// MUM
        System.out.println(s.substring(5));// UM
        System.out.println(s.substring(s.indexOf('I',3)));// IMUM
        System.out.println(s.indexOf('N'));// 2


    }
}
