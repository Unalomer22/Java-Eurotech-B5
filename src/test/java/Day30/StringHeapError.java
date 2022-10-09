package Day30;

public class StringHeapError {
    public static void main(String[] args) {

        System.out.println("Heap out of memory");
        String a = new String();

        a = " Deneme hesap";
        /*
        for (int i = 0; i<1000; i++){
            System.out.println("i = " + i);
            System.out.println(a = a + a); // 26 kez bu toplami yapar sonra OutOfMemory verir.
        }
       */
        int b = 0;
        for(int i=0; i<10000000 ; i++){
            System.out.println("i = " + i);
            System.out.println(b= b + b); // sayi int oldugunda bu islemi String e gore binlerce kez daha fazla yapar.
        }
    }
}
