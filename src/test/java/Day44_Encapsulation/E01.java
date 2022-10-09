package Day44_Encapsulation;

public class E01 {

    private int age = 25;
    private String name = "Ali";

    // getter() olusturmak
    public int getAge() {
        return age;
    }

    public String getName(){
        return name;
    }

    // setter() olusturmak
    public void setAge (int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;

    }
}
