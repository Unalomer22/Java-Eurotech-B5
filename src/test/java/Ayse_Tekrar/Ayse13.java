package Ayse_Tekrar;

import java.util.SimpleTimeZone;

public class Ayse13 {
    // 1. yol : alem methodu icin iki yol var.
    public static void alem (String a, String b){
        if(a.contains(b)){ // b kelimesi a da var mi kontrol ediyoruz
            System.out.println(a.indexOf(b));// IndexOf methodu int deger alir
        }
    }
    /*2.yol
    public static void alem (String a, String b){
        if(a.contains(b)){ // b kelimesi a da var mi kontrol ediyoruz
            return a.indexOf(b);// IndexOf methodu int deger alir
        }
        return -1;
    }
    System.out.println(alem);
     */
    public static void main(String[] args) {
        alem("Insan özgür olmali","özgür");

    }
}
