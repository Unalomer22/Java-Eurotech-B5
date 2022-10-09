package Day21_Method;

public class Method_01 {
    public static void main(String[] args) {
        sum(2,5);
    }
    public static void sum (int i1, int i2) {
        int sum = 0;
        for ( int i = i1; i<=i2; i++) {sum += i;}
        System.out.println("Sum from "+ i1+ " to "+ i2+ " is "+ sum);
    }
}
