package Day16_Ternary;

public class Ternary01 {
    public static void main(String[] args) {

        int x, y ;

        x=20;

        // condition false dondugu icin y degiskenine 90 assign edildi.
        y= (x==1) ? 61 : 90;
        System.out.println("Value of y is : " + y);
        // condition true dondugu icin z degiskenine 61 assign edildi.
        int z= (x==20) ? 61 : 90;
        System.out.println("Value of z is : " + z);


    }
}
