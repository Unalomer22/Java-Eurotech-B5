package Day19_WhileLoop;

public class WhileLoop_04 {
    public static void main(String[] args) {
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
