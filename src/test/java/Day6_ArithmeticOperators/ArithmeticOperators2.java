package Day6_ArithmeticOperators;

public class ArithmeticOperators2 {

    public static void main(String[] args) {

        //Yapilan islem dogrudan degiskenin kendisini etkilemiyor
        //Ta ki islem sonucu yeniden degiskene assign edline kadar
        int cars = 120;
        System.out.println(cars + 5);
        System.out.println(cars);

        cars = cars + 5;
        System.out.println(cars);

        double balance = 1450.50;
        double withdraw = 450.50;

        System.out.println(balance - withdraw);
        System.out.println(balance);
        balance = balance - withdraw;
        System.out.println(balance);

    }



}
