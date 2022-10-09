package Day30;

public class GarbageCollectionTest {

    int yas;

    String name;

    public void finalize (){
        System.out.println(" Nesne GC tarafindan hafizadan temizlendi!");

    }

    public static void main(String[] args) {
        GarbageCollectionTest test1 = new GarbageCollectionTest();
        GarbageCollectionTest test2 = new GarbageCollectionTest();
        GarbageCollectionTest test3 = new GarbageCollectionTest();

        test1.yas= 35;
        test1.name = "Ahmet Falanca";

        test2.yas = 55;
        test2.name = " Hasan Falanca";

        test3.yas = 65;
        test3.name = " John Trovalta";

        System.out.println("test1 name = " + test1.name);
        System.out.println("test2 name = " + test2.name);
        System.out.println("test3 name = " + test3.name);
       /* 1. yol test1 ve test2 ye null degerini vererk GC yapabiliriz
        test1= null;
        test2= null;
        */
        // 2. yol test2 yi  test1 e atayarak GC yapabiliriz
        test1= test2;
        System.out.println("test1 = " + test1.name); // test1 temizlendi yerine test2 atandi
        System.out.println("test2 = " + test2.name);
        System.out.println("test3 = " + test3.name);

       System.gc();


    }




}
