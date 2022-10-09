package Day51_Super;

public class Animal {
    public String name;
    public String color;
    Animal(){
        System.out.println("Super(Base) Class Default Constructor has called");
    }
    Animal(String name){
        this.name = name;
        System.out.println("Super(Base) Class param. Constructor has called");
    }
}
