package Day56_Abstraction;

public abstract class Animal {

    public String name;
    public String color;

    public abstract void createSound();
    public abstract void sleep();
    public String printInfo(){

        return "My name is : " + this.name + " "+ "My color is : " + this.color;
    }



}
