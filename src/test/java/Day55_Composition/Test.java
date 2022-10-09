package Day55_Composition;

public class Test {
    public static void main(String[] args) {

    Child child = new Child();
    child.print();// ayni instance child class ta yok iken inheritance iliskisi üzerinden parent class daki instance a ulasiliyor
                    // Eger ayni isimde instance child class da olusturulursa parent class instance hide ediliyor ve child class takine ulasilabiliyor.

    child.printParent(); // Eger bu durumda consepti degistirmeden ( classlar  arsindaki iliski ve accessibility) + (parent class daki instance hide edildigi halde)
                        // parent class daki instance a ulasabilmek isteniyorsa super key word u ile hafizadaki ikinci instance a ulasilabilir.

    }
}
