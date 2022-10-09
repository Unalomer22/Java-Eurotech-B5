package Day16_Ternary;

public class Ternary_M01 {
    public static void main(String[] args) {

        int y = 1;
        int z = 1;

        int a = y<10 ? y++ : z++;

//  a = y++ ;  a = 1 ; y=2 , z = 1,
        System.out.println( y + "," + z + "," + a); // 2 , 1 , 1

                ;
    }
}
