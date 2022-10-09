package Ayse_Tekrar;

public class Ayse04 {
    public static void main(String[] args) {
        System.out.println("l"+ funCarSeq("W").concat("W")+"l"); // lW0Wl
    }

    public static String funCarSeq(String str){
        str = str.trim();
        str += "0";
        return str;
    }
}
