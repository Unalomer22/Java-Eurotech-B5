package Day51_Super;

public class Dog extends Animal {

int numberOfLeg;

    public Dog(String name) {
    }

    Dog(){
        super("Boby");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "numberOfLeg=" + numberOfLeg +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
