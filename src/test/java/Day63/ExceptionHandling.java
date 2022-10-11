package Day63;

public class ExceptionHandling {

    public static void main(String[] args) {
        System.out.println("Exception handling in Java");

        String str = "Ahmet";
        int intA = 0;
        System.out.println(str);

        while (true){
            try {
                str += str;

            }catch (OutOfMemoryError mem){
                System.out.println("Heap memory hatası");
                System.exit(555);
            }
            finally {

            }
        }
    }
}
