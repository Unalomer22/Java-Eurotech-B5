package odevler;

public class As1 {
    public static void main(String[] args) {
        int toplam = 0;
        String word = "21.yüzyil";
        toplam += word.substring(1,2).length();// 1
        toplam += word.substring(6,6).length();// ""
        toplam += word.substring(5,6).length();// 1
        System.out.println("toplam = " + toplam);// 2
    }
}
