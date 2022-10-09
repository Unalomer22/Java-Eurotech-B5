package Day47;

public class Ulkeler {
    //static variable
    static int ulkelerSayaci;
    String name;
    int dummyCounter;

    @Override
    public String toString() {
        return "Ulkeler{" +
                "name='" + name + '\'' +
                ", dummyCounter=" + dummyCounter +
                '}';
    }

    public static void main(String[] args) {
        //Creating first instance;
        Ulkeler obj1 = new Ulkeler();
        obj1.name = "India";
        obj1.dummyCounter = 1;
        ++ulkelerSayaci;

        System.out.println("Obj1 .. : " + obj1);
        System.out.println("Number of Countries created.. : "+ ulkelerSayaci);

        // Creating second instance of the class
        Ulkeler obj2 = new Ulkeler();
        obj2.name = "France";
        obj2.dummyCounter = 1;
        ++ulkelerSayaci;
        System.out.println("Obj2 .. : " + obj2);
        System.out.println("Number of Countries created.. : "+ ulkelerSayaci);
    }
}
