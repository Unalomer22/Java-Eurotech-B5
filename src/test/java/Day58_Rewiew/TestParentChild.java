package Day58_Rewiew;

public class TestParentChild {

    public static void main(String[] args) {

        Child child = new Child();
        System.out.println("Artirmadan önceki deger :" + child.num);

        child.increment();
        System.out.println("Artirmadan sonraki deger :" + child.num);

        Parent parent = new Parent();
        System.out.println("Artirmadan önceki deger :" + parent.num);

        parent.increment();
        System.out.println("Artirmadan sonraki deger :" + parent.num);

    }



}
