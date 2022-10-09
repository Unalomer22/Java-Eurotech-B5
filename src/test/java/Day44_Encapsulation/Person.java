package Day44_Encapsulation;

public class Person {

    String name;
    private int age;

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name= newName;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge (int newAge){
        this.age = newAge;
    }

    public void print(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}
