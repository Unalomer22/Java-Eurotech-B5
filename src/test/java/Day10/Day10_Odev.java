package Day10;

public class Day10_Odev {
    //Ensar bey
    public static void main(String[] args) {
    /*    System.out.println("x = " + x);
        System.out.println("y = " + y);
///short curciut : && olarak kullanmaliyiz. java ilk veriden sonra sistemden cikar
        System.out.println("x>y? "+ ((x>y) &&(x== (y+=3))));*/

        int x = 8;
        int y = 5;
        int z = 11;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println(x > y);
        System.out.println((x > y) || (x==(y+=3)));
        System.out.println("y = " + y);

        System.out.println((x>z)|| (y<z));
        System.out.println((x<y)||(y>z));
    }


}
