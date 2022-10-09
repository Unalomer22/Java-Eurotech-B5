package Ayse_Tekrar;

public class Ayse09 {

    public static String getMesaj(String x){
       String str = "Yaz geldi";
       str = str.concat(" artik gülmeli x");
       str.replace("x",x);// burada "=" lik olmadigi icin replace i kullanamiyoruz
       String rewiew = " ve cocuklar";
       str.concat(rewiew);// burada "=" lik olmadigi icin concat i kullanamiyoruz
       return str;
    }

    public static void main(String[] args) {
        String str = "Günes";
        System.out.println(getMesaj(str));// Yaz geldi artik gülmeli x
    }
}
