package Ayse_Tekrar;

public class Ayse14 {
    public static void main(String[] args) {
        // double array kabul eden bir method yazin
        // bu method bize gönderilen dizinin ortalamasini hesaplayip sonucu dönsün
        double[] dizi = {16.3,7.5,78.6,-20.4,43.05,45};

        System.out.println(average(dizi));
    }
    public static double average(double [] list){

        int sum = 0;
        double result= 0.0;

        for (double sayilar : list) {
        sum += sayilar;
        }
        result = sum / list.length;
        return result;
    }
}
