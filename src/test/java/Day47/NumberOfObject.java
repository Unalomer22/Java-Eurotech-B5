package Day47;

public class NumberOfObject {
    static int numberOfObject;

    NumberOfObject(){

        numberOfObject++;
    }

    public static void main(String[] args) {

        NumberOfObject nmbrObj = new NumberOfObject();
        NumberOfObject nmbrObj1 = new NumberOfObject();
        NumberOfObject nmbrObj2 = new NumberOfObject();
        NumberOfObject nmbrObj3 = new NumberOfObject();

        System.out.println("Number of objects .. :" +NumberOfObject.numberOfObject);// 4

    }
}
