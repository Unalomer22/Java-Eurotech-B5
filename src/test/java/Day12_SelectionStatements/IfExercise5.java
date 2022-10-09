package Day12_SelectionStatements;

public class IfExercise5 {
    public static void main(String[] args) {
        /*
        Bir ucgenin cesidini bulan java kodunu yaziniz\

        Eg. uc kenari da esitse, eskenar
        uc kenari da farkli degerlerrdeyse cesitkenar
        iki kenari esitse ikizkenar ucgen seklinde bise yazdirin
         */
        int birinciKenar = 25;
        int ikinciKenar = 250;
        int ucuncuKenar = 25 ;

        if(birinciKenar==ikinciKenar && birinciKenar==ucuncuKenar ){
            System.out.println("Eskenar Ucgen ");
        }

        if (birinciKenar!=ikinciKenar && ikinciKenar!=ucuncuKenar ){
            System.out.println("Cesit Kenar Ucgen");
        }
        if (birinciKenar==ikinciKenar && ikinciKenar!=ucuncuKenar ) {
            System.out.println("Ikizkenar Ucgen");
        }

        }
}
