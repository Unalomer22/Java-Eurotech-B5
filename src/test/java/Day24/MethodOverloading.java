package Day24;

public class MethodOverloading {

    public static void main(String[] args) {
        int z= sumOfNumbers(4,7);

        System.out.println("Sonuc : " + sumOfNumbers(5,6));
        System.out.println("z = " + z);

        System.out.println("^sayının toplamı: " + sumOfNumbers(2,4,6));

        // Method Overloadıng calls
        System.out.println("Method overloadıng two numbers :" + sumOfNumbers(4,5));
        System.out.println("Method overloadıng three numbers :" + sumOfNumbers(4,5,15));

        System.out.println(sumOfNumbers(7,4));
        System.out.println(sumOfNumbers(4,7,9));
        System.out.println(sumOfNumbers(5,7.8f));
    }

    public static int sumOfNumbers(int x,int y){
        return (x+y);
    }

    public static int sumOfNumbers(int x,int y, int z){
        return (x+y+z);
    }
    public static float sumOfNumbers(int x,float y){
        return (x+y);
    }
}
