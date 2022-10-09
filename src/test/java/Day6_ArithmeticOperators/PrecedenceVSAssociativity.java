package Day6_ArithmeticOperators;

public class PrecedenceVSAssociativity {

    public static void main(String[] args) {

        //Compiler aritmatic islemleri onceligine gore yapar
        System.out.println(3 + 5 * 7);

        System.out.println(42 - 15 / 3);

        System.out.println(8 + 2 * 3 - 21 / 7 + 6);

        System.out.println(4 + 42 / 2 * 3);

        System.out.println(6 - 3 * 3 + 6 - 8);

        int sayi = 6 - 3 * 3 + 6 - 8;
        System.out.println(sayi);

        //Parantes tum islemler acisindan compiler tarafindan
        //en oncelikli olarak hesaplanir
        System.out.println(3 + 4 * 4 + 5 * 4 + 3 - 1); //41
        System.out.println(3 + 4 * 4 + 5 * (4 + 3) - 1); //53
        System.out.println(3 + 4 * (4 + 5 * (4 + 3) - 1)); //155

    }



}
