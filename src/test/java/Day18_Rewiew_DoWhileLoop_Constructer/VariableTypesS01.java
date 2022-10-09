package Day18_Rewiew_DoWhileLoop_Constructer;

public class VariableTypesS01 {
    /*                    INTANCE VARIABLE
    1) Main methodun  ve urettigimiz diger methodlarin disinda ( altinda veya ustunde ), class in icinde  olusturulan
    variable lara " instance variable " denir.
    2) Instance variable lar object olusturulurken olusturulur ve her obje ye bu variable lar monte edilir
    3) Instance variable lara deger atamasi yapsaniz da olur yapmasanizda olur.
    Asagida goruldugu gibi "i" variable ina deger atamasi yaptim,"k" variable ina deger atamasi yapmadim.
    Note: Bir variable a deger atamasi yapmaya " Initialize" = (baslatmak ) denir.
    i variable i initialize edildi, digerleri edilmedi.
    4) Initialize edilmeyen " instance variable " lar icin java kendisi deger atamasi yapar.
    Java nin instance variable lara kendisinin verdigi degerlere "default value" denir.
    byte,short,int,long icin default value " 0 " dir.
    float, double icin default value 0.0 dir.
    char icin default value 0 dir
    boolean icin default value false dir
    String icin default value null dur
     */
    int i= 12;// i initialize edildi, yani deger atanarak baslatildi
    int k ;// default value 0
    String s;// default value null
    boolean b;// default value false
    double d;// default value 0.0
    char c;// default value 0
/*                          LOCAL VARIABLE
1) Main methodun veya olusturdugumuz baska bir methodun icinde olusturulan variable lara " Local variable " denir
2) Local variable lara deger atamasi yapmak zorundayiz, aksi takdirde o variable i kullanamayiz.
Java local variable lar icin " default value"  atamasi yapmaz.
 */

    public static void main(String[] args) {
        int a = 13;
        a++;
        System.out.println(a);// 14

    }
}
