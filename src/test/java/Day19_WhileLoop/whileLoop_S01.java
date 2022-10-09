package Day19_WhileLoop;

public class whileLoop_S01 {
    public static void main(String[] args) {
    // While loop kullanarak 1 den 5 e kadar tam sayilari ekrana yazdirin
        int i= 1;
        while ( i<=5){
            System.out.print(i);
            i++;

        }
        System.out.println();

        // While loop kullanarak 10 dan kucuk sayma sayilarini, ayni satirda, aralarina bosluk koyarak ekrana yazdirin
        int k = 1;
        while (k<10){
            System.out.print(k + " ");
            k++;
        }

        System.out.println();
        // While loop kullanarak 50 dan kucuk cift sayilarini, ayni satirda, aralarina bosluk koyarak ekrana yazdirin
int m = 1;
        while (m<50){
            if ( m%2==0){
                System.out.print(m + " ");
            }
            m++;
        }

    }
}
