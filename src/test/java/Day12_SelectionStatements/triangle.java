package Day12_SelectionStatements;

public class triangle {

    public static void main(String[] args) {

        double aci1 = 60 ;
        double aci2 = 70 ;
        double aci3 = 50 ;

        if (aci1 + aci2 + aci3 == 180){
            System.out.println(" Bu bir ucgendir");
        } else {
            System.out.println(" Bu bir ucgen degildir");
        }

        System.out.println("/////////////////////////");

        double kenar1 = 7;
        double kenar2 = 7 ;
        double kenar3 = 8 ;

        if ( kenar1 + kenar2 > kenar3 && kenar1 + kenar3 > kenar2 && kenar2 + kenar3 > kenar1 ){
            System.out.println(" Bu bir ucgendir");
        } else {
            System.out.println(" Bu bir ucgen degildir");
        }

    }
}
