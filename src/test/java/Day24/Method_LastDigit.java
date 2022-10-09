package Day24;

public class Method_LastDigit {
// Wrıte a method that accepts 2 numbers and return ıf they have the same last dıgıt
    // Sample Output : lastDigit(5,25) true, lastDigit(9,253) false...
    public static boolean lastDigit(int x, int y) {
        if (x % 10 == y % 10) {
            return true;
        } else return false;
    }

    public static boolean sonharf(char a, char b){
        if ( a==b)return true;
        else return false;
    }

    public static void main(String[] args) {
        if(lastDigit(64745,7585)){
            System.out.println("Bu iki sayının son rakamları bırbırıne esıttır.");
        }else System.out.println("Bu iki sayının son rakamları bırbırıne esıt degıldır.");

        System.out.println("sonharf "+ sonharf('f', 'f'));
        System.out.println(lastDigit(35676,706));
        System.out.println(lastDigit(354,7565));
        System.out.println(lastDigit(53646,75838));
        System.out.println(lastDigit(43522, 894842));
    }






}
