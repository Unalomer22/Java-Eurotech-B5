package Day18_Rewiew_DoWhileLoop_Constructer;

public class Animal {
    int age ;
    String name;
    int numOfLegs;
    boolean isMamma;

    public Animal(){

        System.out.println("Parametresiz");
   //     this.age= 11; Bu sekilde yazdigimda neden int constructer a gitmedi?
    }
    public Animal(String name){
        this();// Parametresiz constructer i cagirir.
        System.out.println("Name Parametreli");
    }

    public Animal(int age){

        System.out.println("Age parametreli");
    }

    public Animal(String name, int age){

        System.out.println("Name ve Age Parametreli");
    }
    public static void main(String[] args) {
        Animal a1 = new Animal("Cat");
    }
}
