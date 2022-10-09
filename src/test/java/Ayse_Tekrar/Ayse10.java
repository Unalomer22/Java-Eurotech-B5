package Ayse_Tekrar;

public class Ayse10 {
    public static void main(String[] args) {
    int x1= getLoad();// 3
    int d = getLoad(x1,"EuroTech");// 9

        System.out.println(x1 + d);    // 12
    }
    public static int getLoad(){
        return 3;
    }
    public static int getLoad(int x1, String x2){
        return x1+x2.length()-2;
    }

}
